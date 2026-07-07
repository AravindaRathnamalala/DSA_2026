package binary_search

import kotlin.collections.flatten

class TwoDMatrix {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
//non binary solution
        var left = 0
        val arr = matrix.flatMap { it.asList() }
        var right = arr.size - 1

        while (left <= right) {
            val mid = left + (right - left) / 2
            when{
                arr[mid] == target -> return true
                arr[mid] > target -> right = mid - 1
                else -> left = mid + 1
            }
        }
        return false

    }
}