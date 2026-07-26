package dfs

import TreeNode
import kotlin.math.abs

class `Binary Tree Tilt` {

    fun findTilt(root: TreeNode?): Int {
        var sum = 0

        fun dfs(node: TreeNode?) : Int{
            if (node == null) return 0

            val leftSum = dfs(node.left)
            val rightSum = dfs(node.right)

            sum += abs(leftSum - rightSum)
            return leftSum + rightSum + node.`val`
        }

        dfs(root)
        return sum

    }
}