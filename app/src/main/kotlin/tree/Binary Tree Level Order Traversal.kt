package tree

import TreeNode
import java.util.LinkedList
import java.util.Queue

class `Binary Tree Level Order Traversal` {

    fun levelOrder(root: TreeNode?): List<List<Int>> {

        if (root == null) return emptyList()
        val result = mutableListOf<List<Int>>()
        val queue : Queue<TreeNode> = LinkedList()

        queue.offer(root)

        while(queue.isNotEmpty()) {
            val levelSize = queue.size
            val level = mutableListOf<Int>()

            repeat(levelSize) {
                val node = queue.poll()
                level.add(node.`val`)

                node.left?.let { queue.offer(it) }
                node.right?.let { queue.offer(it) }
            }

            result.add(level)
        }
        return result
    }
}

//Time : O(n)
//Space : O(n)