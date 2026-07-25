package dfs

import TreeNode

class ` Sum of Left Leaves` {

    fun sumOfLeftLeaves(root: TreeNode?): Int {
        var sum = 0
        if (root == null) return 0

        if (root.left != null
            && root.left!!.left == null
            && root.left!!.right ==null
            ){
            sum += root.left!!.`val`
        }

        sum += sumOfLeftLeaves(root.left)
        sum += sumOfLeftLeaves(root.right)

        return sum
    }
}