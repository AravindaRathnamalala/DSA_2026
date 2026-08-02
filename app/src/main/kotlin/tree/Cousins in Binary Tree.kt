package tree

import TreeNode
import java.util.LinkedList
import java.util.Queue

class `Cousins in Binary Tree` {

    fun isCousins(root: TreeNode?, x: Int, y: Int): Boolean {
        if (root == null) return false
        val queue: Queue<TreeNode> = LinkedList()
        queue.offer(root)

        while (queue.isNotEmpty()) {
            val size = queue.size
            var foundX = false
            var foundY = false

            repeat(size) {
                val node = queue.poll()
                if (node.`val` == x ) foundX = true
                if (node.`val` == y) foundY = true

                if (node.left != null && node.right != null) {
                    val left = node.left!!.`val`
                    val right = node.right!!.`val`

                    if ((left == x && right == y) || (left != y && right == x)) {
                        return false
                    }
                }

                node.left?.let { queue.offer(it) }
                node.right?.let { queue.offer(it) }
            }

            if (foundX && foundY) return true
            if (foundX || foundY) return false
        }
        return false

    }
}