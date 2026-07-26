package arrays_and_hashing

class `Squares of a Sorted Array` {

//    Input: nums = [-4,-1,0,3,10]
//    Output: [0,1,9,16,100]

    fun sortedSquares(nums: IntArray): IntArray {
        val result = IntArray(nums.size)
        var start = 0
        var end  = nums.lastIndex
        var index = nums.lastIndex

        while (start <= end) {
            val left = nums[start] * nums[start]
            val right = nums[end] * nums[end]

            if (right > left) {
                result[index] = right
                end --
            } else {
                result[index] = left
                start ++
            }
            index --
        }

        return result

    }
}