package two_pointers

class ValidPalindrome {

    fun isPalindrome(s: String): Boolean {
        val cleaned = s
            .lowercase()
            .replace(Regex("[^a-z0-9]"), "")
        var left = 0
        var right = cleaned.length - 1
        while (left <= right) {
            if(cleaned[left] == cleaned[right]) {
                left++
                right--
            } else {
                return false
            }
        }
        return true
    }
}