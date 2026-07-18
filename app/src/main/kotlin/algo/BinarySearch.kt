package algo

class BinarySearch {

    fun binarySearch(nums: IntArray, target: Int): Int {
        var left = 0
        var right  = nums.size-1
        while (left <= right) {
            val mid = left +(right-left)/2

            when{
                nums[mid] == target -> return mid
                nums[mid] > target -> left = mid+1
                else -> right = mid-1
            }
        }
        return -1
    }


    fun binarySearchWithRecursion(nums: IntArray, target: Int, left: Int, right: Int) : Int {
        if (left > right) return -1
        val mid  = left+ (left - right)/2
        return when{
            nums[mid] == target -> mid
            nums[mid] > target -> binarySearchWithRecursion(nums, target, mid + 1, right)
            else -> binarySearchWithRecursion(nums, target, mid - 1, right)
        }
    }
}