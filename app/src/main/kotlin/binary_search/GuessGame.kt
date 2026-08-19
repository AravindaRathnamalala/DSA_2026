package binary_search

class Solution : GuessGame() {
    override fun guessNumber(n: Int): Int {
        var left = 0
        var right = n

        while(left <= right) {
            val mid = left + (right - left) / 2

            when(guess(mid)) {
                0 -> return mid
                1 -> right = mid -1
                -1 -> left = mid + 1
            }
        }

        return -1

    }
}