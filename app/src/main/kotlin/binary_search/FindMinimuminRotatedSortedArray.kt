package binary_search

class FindMinimumInRotatedSortedArray {
    //Time complexity = O(log n)
    //Space complexity = O(1)
    fun findMin(nums: IntArray): Int {
        var left = 0
        var right = nums.lastIndex

        while (left < right) {
            val mid = left + (right - left) / 2
            when{
                nums[mid] > nums[right] -> left = mid + 1
                else -> right = mid
            }

        }
        return nums[left]
    }
}