package binary_search

class EatingBananas {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {
        var upperBound = piles.max()
        var left  = 1
        var answer = 0

        while (left <= upperBound) {
            val mid  = left + (upperBound - left) / 2

            when (canFinish(piles, h, mid)) {
                true -> {
                    answer = mid
                    upperBound = mid -1
                }
                false -> {
                    left = mid + 1
                }
            }
        }
        return answer

    }

    private fun canFinish(piles: IntArray, h: Int, mid: Int) : Boolean {
        var duration = 0L
        for (i in piles.indices) {
            duration += (piles[i] + mid -1) / mid
        }
        return duration <= h
    }


}