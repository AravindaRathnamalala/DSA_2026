package arrays_and_hashing

class ProductExceptSelf {

    fun productExceptSelf(nums: IntArray): IntArray {
        val n = nums.size
        val arr = IntArray(n)
        var prefix = 1
        var suffix = 1
        for (i in nums.indices) {
            arr[i] = prefix
            prefix *= nums[i]
        }
        for (i in n - 1 downTo 0) {
            arr[i] = suffix*arr[i]
            suffix *= nums[i]
        }
        return arr
    }
}