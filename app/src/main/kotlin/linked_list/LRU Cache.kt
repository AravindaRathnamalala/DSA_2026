package linked_list


class LRUCache(private val capacity: Int) {

    class Node(var key: Int, var value: Int) {
        var prev: Node? = null
        var next: Node? = null
    }

    val cache = HashMap<Int, Node>()

    var head: Node = Node(0, 0)
    var tail: Node = Node(0, 0)

    init {
        head.next = tail
        tail.prev = head
    }


    fun get(key: Int): Int {
        val node = cache[key] ?: return -1
        remove(node)
        insert(node)
        return node.value
    }

    fun put(key: Int, value: Int) {
        cache[key]?.let {
            remove(it)
        }
        val node = Node(key, value)
        insert(node)
        cache[key] = node
        if (cache.size > capacity) {
            val last = tail.prev
            remove(last)
            cache.remove(last?.key)
        }
    }

    fun remove(node: Node?) {
        val prev = node?.prev
        val next = node?.next

        prev?.next = next
        next?.prev = prev
    }

    fun insert(node: Node?) {
        node?.next = head.next
        node?.prev = head

        head.next?.prev = node
        head.next = node
    }
}