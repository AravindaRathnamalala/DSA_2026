package tree

import TreeNode

class `Minimum Distance Between BST Nodes` {

    fun minDiffInBST(root: TreeNode?): Int {
        var prev: TreeNode? = null
        var min = Int.MAX_VALUE

        fun inorder(node: TreeNode?) {
            if (node == null) return

            inorder(node.left)
            prev?.let { min = minOf(min, node.`val` - it.`val`) }
            prev = node
            inorder(node.right)

        }
        inorder(root)

        return min

    }


}