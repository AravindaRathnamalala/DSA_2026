package tree

import TreeNode

class `Diameter of Binary Tree` {

    var diameter: Int = 0
    fun diameterOfBinaryTree(root: TreeNode?): Int {
        dfs(root)
        return diameter
    }

    fun dfs(root: TreeNode?): Int {
        if (root == null) return 0
        val right = dfs(root.right)
        val left = dfs(root.left)
        diameter = maxOf(diameter, left+right)
        return 1 + maxOf(left, right)
    }
}

//Time complexity: O(n)
//Space Complexity: O(h)