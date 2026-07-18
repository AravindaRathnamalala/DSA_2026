package backtracking

class `Combination Sum` {

    fun combinationSum(nums: IntArray, target: Int): List<List<Int>> {
        val result = mutableListOf<List<Int>>()

        fun backtrackingSum(
            start: Int,
            remaining: Int,
            current: MutableList<Int>,
        ) {
            if(remaining == 0) {result.add(current.toList())}
            if (remaining < 0) return
            for(i in start until nums.size) {
                current.add(nums[i])
                backtrackingSum(i, remaining - nums[i], current)
                current.removeAt(current.size - 1)
            }
        }

        backtrackingSum(0, target, mutableListOf())
        return result
    }
}