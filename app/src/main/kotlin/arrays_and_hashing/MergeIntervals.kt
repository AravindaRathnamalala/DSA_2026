package arrays_and_hashing

class MergeIntervals {

    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        if (intervals.isEmpty()) return emptyArray()

        intervals.sortBy { it[0] }

        val result = mutableListOf<IntArray>()
        var curr = intervals[0]

        result.add(curr)

        for(i in 1 until  intervals.size ) {
            val next = intervals[i]
            if (next[0] <= curr[1]) {
                curr[1] = maxOf(curr[1], next[1])
            } else {
                curr = next
                result.add(curr)
            }
        }

        return result.toTypedArray()
    }
}