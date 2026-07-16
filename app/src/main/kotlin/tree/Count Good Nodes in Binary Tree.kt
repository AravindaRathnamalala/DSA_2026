package tree

import TreeNode

class `Count Good Nodes in Binary Tree` {

    fun goodNodes(root: TreeNode?): Int {
        return dfs(root, Int.MIN_VALUE)
    }

    private fun dfs(node: TreeNode?, max: Int): Int {

        if (node == null) return 0

        var count = 0

        if (node.`val` >= max) {
            count++
        }

        val newMax = maxOf(node.`val`, max)

        count += dfs(node.left, newMax)
        count += dfs(node.right, newMax)

        return count

    }
}

//Time: O(n)
//Space: O(h)