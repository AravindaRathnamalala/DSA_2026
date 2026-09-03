package arrays_and_hashing

class `Reverse Vowels of a String` {

    fun reverseVowels(s: String): String {
        val vowels = "aeiouAEIOU"
        val chars = s.toCharArray()

        var left = 0
        var right = chars.lastIndex

        while (left < right) {
            while (left < right && !vowels.contains(chars[left])) left++
            while (right > left && !vowels.contains(chars[right])) right--

            if(left < right) {
                val temp = chars[left]
                chars[left] = chars[right]
                chars[right] = temp
                left++
                right--

            }
        }
        return String(chars)
    }
}