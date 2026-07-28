package arrays_and_hashing

class `Jewels and Stones` {

    fun numJewelsInStones(jewels: String, stones: String): Int {
        var counter = 0
        val set = jewels.toHashSet()
        for (stone in stones) {
            if (set.contains(stone)) {
                counter++
            }
        }
        return counter
    }
}