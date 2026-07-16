package tree

import TreeNode

class `Valid Binary Search Tree` {
    fun isValidBST(root: TreeNode?): Boolean {
        return dfs(root, Long.MIN_VALUE, Long.MAX_VALUE)

    }

    fun dfs(node: TreeNode?, min: Long, max: Long): Boolean {
        if (node == null) return true

        if (node.`val` <= min || node.`val` >= max) return false

        return dfs(node.left, min, node.`val`.toLong())
                && dfs(node.right, node.`val`.toLong(), max)

    }
}

