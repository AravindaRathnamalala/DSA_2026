package tree

import TreeNode

class `Invert Binary Tree` {

    fun invertTree(root: TreeNode?): TreeNode? {
        if (root == null) {
            return null
        }

        val temp = root.left
        root.left = root.right
        root.right = temp

        root.left = root.right.also { root.right = root.left}

        invertTree(root.left)
        invertTree(root.right)

        return root
    }
}