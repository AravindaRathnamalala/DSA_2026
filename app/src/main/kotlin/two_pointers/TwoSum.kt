package two_pointers

class TwoSum {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        var left = 1
        var right = nums.size

        if (nums.isEmpty()) return intArrayOf()

        while (left <= right) {
            val total = nums[left] + nums[right]
            when{
                target == total -> return intArrayOf(left, right)
                target < total -> left ++
                target > total -> right --
            }
        }
        return intArrayOf()
    }
}