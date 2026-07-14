package tree

import TreeNode

class `Same Binary Tree` {

    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        if (q == null && p == null) return true
        if (q == null || p == null) return false
        if (p.`val` != q.`val`) return false
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
    }
}