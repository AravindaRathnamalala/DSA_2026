package linked_list

import Node

class `Copy Linked List with Random Pointer` {

    fun copyRandomList(head: Node?): Node? {

        if (head == null) return null

        val map = mutableMapOf<Node, Node>()
        var current : Node? = head

        while (current != null) {
            map[current] = Node(current.`val`)
            current = current.next
        }

        current = head

        while (current != null) {
            val copyNode = map[current]
            copyNode?.next = map[current.next]
            copyNode?.random = map[current.random]

            current = current.next
        }

        return map[head]


    }
}