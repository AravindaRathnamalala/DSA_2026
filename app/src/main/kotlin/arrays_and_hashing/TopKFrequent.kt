package arrays_and_hashing

class TopKFrequent {

    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val map = hashMapOf<Int, Int>()
        for (num in nums) {
            map[num] = map.getOrDefault(num, 0) + 1
        }
        return  map.entries.sortedByDescending { it.value }.take(k).map { it.key }.toIntArray()
    }


    fun topKFrequent(words: Array<String>, k: Int): List<String> {
        val hMap = mutableMapOf<String, Int>()

        words.forEach { word ->
            hMap[word] = hMap.getOrDefault(word, 0) + 1
        }

        return hMap.keys.sortedWith(compareByDescending<String> { hMap[it] }.thenBy { it}).take(k)
    }

}