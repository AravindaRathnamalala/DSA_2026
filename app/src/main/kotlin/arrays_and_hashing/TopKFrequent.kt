package arrays_and_hashing

class TopKFrequent {

    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val map = hashMapOf<Int, Int>()
        for (num in nums) {
            map[num] = map.getOrDefault(num, 0) + 1
        }
        return  map.entries.sortedByDescending { it.value }.take(k).map { it.key }.toIntArray()
    }

}