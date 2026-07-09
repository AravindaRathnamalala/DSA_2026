package binary_search

class ValidPerfectSquare {

    fun isPerfectSquare(num: Int): Boolean {
        var left = 1
        var right = num / 2
        if (num == 1) return true
        while (left <= right) {
            val mid = left + (right - left) / 2
            val square = mid.toLong() * mid
             when{
                 square == num.toLong() -> return true
                 square < num -> right = mid - 1
                 square > num -> left = mid + 1
             }
        }
        return false
    }

}