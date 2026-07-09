package binary_search

class SearchInRotatedSortedArray {

    fun search(nums: IntArray, target: Int): Int {

        var left  = 0
        var right = nums.lastIndex
        while(left <= right) {
            val mid = left + (right - left) / 2
            if (nums[mid] == target) return mid
            if (nums[left] <= nums[mid]){
                if(target < nums[mid] && nums[left] <= target){
                    right = mid - 1
                } else {
                    left = mid + 1
                }
            } else {
                if(target > nums[mid] && nums[right] >= target){
                    left = mid + 1
                } else {
                    right = mid - 1
                }
            }
        }
        return -1
    }

    //Space : O(n)  using only left, right and mid
    //Time : O(log n) used binary search
}