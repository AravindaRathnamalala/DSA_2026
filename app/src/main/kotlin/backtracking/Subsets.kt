package backtracking

class Subsets {
    fun subsets(nums: IntArray): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        val subsets = mutableListOf<Int>()

        fun backTrack(index: Int) {
            if (index == nums.size) {
                result.add(subsets.toList())
                return
            }

            subsets.add(nums[index])
            backTrack(index+1)
            subsets.removeAt(subsets.size - 1)
            backTrack(index+1)
        }

        backTrack(0)

        return result

    }
}

//Time: n.2 pow 2
//Space (n)