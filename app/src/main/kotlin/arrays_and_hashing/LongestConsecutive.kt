package arrays_and_hashing

class LongestConsecutive {

    fun longestConsecutive(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        nums.sort()
        var lengthOfNumbers = 1
        var temp = 1
        for (i in 1 until nums.size) {
            when  {
                nums[i] == nums[i - 1] -> continue
                nums[i] == nums[i-1]+1 ->   {
                    temp ++
                }
                else -> {
                    lengthOfNumbers = maxOf(lengthOfNumbers, temp)
                    temp = 1
                }
            }
        }
        return maxOf(lengthOfNumbers, temp)
    }
}