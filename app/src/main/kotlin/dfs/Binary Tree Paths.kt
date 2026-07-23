package dfs

import TreeNode

class `Binary Tree Paths` {

    fun binaryTreePaths(root: TreeNode?): List<String> {

        val result  = mutableListOf<String>()

        fun dfs(node: TreeNode?, path: String) {
            if (node == null) return
            val current = if (path.isEmpty()) "${node.`val`}" else "path->${node.`val`}"

            if (node.left == null && node.right == null) {
                result.add(current)
                return
            }
            dfs(node.left, current)
            dfs(node.right, current)
        }

        dfs(root, "")
        return result
    }
}