package bfs

import TreeNode

class `Univalued Binary Tree` {


    fun isUnivalTree(root: TreeNode?): Boolean {
        var res = true
        if (root == null) return true
        val valueOfRoot = root.`val`

        fun bfs(node: TreeNode?) {
            if (node == null) return

            if (node.`val` != valueOfRoot) {
                res = false
            }
            bfs(node.left)
            bfs(node.right)
        }
        bfs(root)
        return res
    }
}