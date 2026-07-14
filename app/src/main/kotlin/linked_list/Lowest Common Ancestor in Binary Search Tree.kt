package linked_list

import TreeNode

class `Lowest Common Ancestor in Binary Search Tree` {

    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {

        if (root == null) return null

        var current  = root

        while (current != null) {

            if (p!!.`val` < current.`val` && q!!.`val` < current.`val`) {
                current = current.left
            } else if (p!!.`val` > current.`val` && q!!.`val` > current.`val`) {
                current = current.right
            } else return current
        }
        return null
    }

}

//Time: O(h)
//Space: O(1)