package backtracking

class Permutations {

    fun permute(nums: IntArray): List<List<Int>> {
        val result  = mutableListOf<List<Int>>()
        val current = mutableListOf<Int>()
        val used = BooleanArray(nums.size)

        fun dfs(nums: IntArray) {

            if (current.size == nums.size) {
                result.add(current.toList())
                return
            }

            for (i in nums.indices) {
                if(used[i]) continue

                used[i] = true
                current.add(nums[i])

                dfs(nums)

                current.removeAt(current.lastIndex)
                used[i] = false
            }
        }
        dfs(nums)
        return result
    }
}

//Time : O(n * n!)
//space : O(n)