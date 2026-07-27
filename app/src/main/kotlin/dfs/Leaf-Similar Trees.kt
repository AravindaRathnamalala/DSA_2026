package dfs

import TreeNode

class `Leaf-Similar Trees` {

    fun leafSimilar(root1: TreeNode?, root2: TreeNode?): Boolean {
        val leaves1 = mutableListOf<Int>()
        val leaves2 = mutableListOf<Int>()
        dfs(root1, leaves1)
        dfs(root2, leaves2)
        return leaves1 == leaves2
    }

    fun dfs(node: TreeNode?, list: MutableList<Int>) {
        if (node == null) return
        if (node.left == null && node.right == null) {
            list.add(node.`val`)
            return
        }
        dfs(node.left, list)
        dfs(node.right, list)
    }
}