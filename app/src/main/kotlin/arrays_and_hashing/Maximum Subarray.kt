package arrays_and_hashing

class `Maximum Subarray` {

    fun maxSubArray(nums: IntArray): Int {
        var max = nums[0]
        var curr = nums[0]

        for (i in  1 until nums.size) {
            curr = maxOf(nums[i], nums[i]+curr)
            max = maxOf(max, curr)
        }
        return max
    }
}