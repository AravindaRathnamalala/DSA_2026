package backtracking

class `Subsets II` {

    fun subsetsWithDup(nums: IntArray): List<List<Int>> {
        nums.sort()
        val result  = mutableListOf<List<Int>>()
        val current = mutableListOf<Int>()

        fun dfs(idx: Int) {
            result.add(current.toList())
            for (i in idx until nums.size) {
                if (i > idx && nums[i] == nums[i - 1]) continue
                current.add(nums[i])
                dfs(i+1)
                current.removeAt(current.lastIndex)
            }

        }

        dfs(0)
        return result
    }
}