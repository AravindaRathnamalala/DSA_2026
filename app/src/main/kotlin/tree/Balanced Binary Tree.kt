package tree

import TreeNode

class `Balanced Binary Tree` {

    fun isBalanced(root: TreeNode?): Boolean {
        return dfs(root) != -1
    }

    fun dfs(root: TreeNode?): Int {
        if (root == null) return 0

        val leftHeight = dfs(root.left)
        if (leftHeight == -1) return -1

        val rightHeight = dfs(root.right)
        if (rightHeight == -1) return -1

        if(kotlin.math.abs(leftHeight- rightHeight) > 1) return -1

        return 1 + maxOf(leftHeight, rightHeight)
    }


}