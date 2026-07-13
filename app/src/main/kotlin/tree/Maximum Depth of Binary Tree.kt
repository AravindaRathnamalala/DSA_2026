package tree

import TreeNode

class `Maximum Depth of Binary Tree` {

    fun maxDepth(root: TreeNode?): Int {
        if (root == null) return 0
        val left = maxDepth(root.left)
        val right = maxDepth(root.right)
        return 1 + maxOf(left, right)
    }
}

//Time complexity: O(n)