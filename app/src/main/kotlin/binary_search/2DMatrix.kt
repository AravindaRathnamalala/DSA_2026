package binary_search

import kotlin.collections.flatten

class TwoDMatrix {
    fun searchMatrixLinear(matrix: Array<IntArray>, target: Int): Boolean {
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


    fun searchMatrixBinaryS(matrix: Array<IntArray>, target: Int): Boolean {
        var left = 0
        val rows = matrix.size
        val cols = matrix[0].size
        var right = rows*cols - 1

        while (left <= right) {
            val mid = left + (right - left) / 2
            val value = matrix[mid/cols][mid%cols]
            when{
                value == target -> return true
                value < target -> left = mid + 1
                else -> right = mid - 1
            }
        }
        return false
    }
}