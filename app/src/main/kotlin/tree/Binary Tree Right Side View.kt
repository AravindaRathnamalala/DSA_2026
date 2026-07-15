package tree

import TreeNode
import java.util.LinkedList
import java.util.Queue

class `Binary Tree Right Side View` {

    fun rightSideView(root: TreeNode?): List<Int> {
        if (root == null) return emptyList()
        val result = mutableListOf<Int>()
        val queue: Queue<TreeNode> = LinkedList()

        queue.add(root)

        while (!queue.isEmpty()) {
            val level = queue.size
            for (i in 0 until level) {
                val node = queue.poll()
                if(i == level - 1) {
                    result.add(node.`val`)
                }
                node.left?.let { queue.add(it) }
                node.right?.let { queue.add(it) }
            }
        }
        return result
    }
}