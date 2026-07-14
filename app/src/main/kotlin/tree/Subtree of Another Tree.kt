package tree

import TreeNode

class `Subtree of Another Tree` {

    fun isSubtree(root: TreeNode?, subRoot: TreeNode?): Boolean {
        if (subRoot == null) return true
        if (root == null) return false


        return isSameTree(root, subRoot)
                || isSubtree(root.left, subRoot)
                || isSubtree(root.right, subRoot)
    }

    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {

        if (p == null && q == null) return true
        if (p == null || q == null) return false
        if (p.`val` != q.`val`) return false

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
    }
}

//time complexity: O(n)
//Space complexity: O(h) - height of tree