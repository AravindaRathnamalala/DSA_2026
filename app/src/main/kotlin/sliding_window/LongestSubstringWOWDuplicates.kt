package sliding_window

class LongestSubstringWOWDuplicates {

    fun lengthOfLongestSubstring(s: String): Int {
        val window = hashSetOf<Char>()
        var left = 0
        var maxLength = 0
        if (s.isEmpty()) return 0
        if (s.length == 1) return 1
        for (right in s.indices) {

            while(s[right] in window) {
                window.remove(s[left])
                left ++
            }

            window.add(s[right])
            maxLength = maxOf(maxLength, right - left +1)
        }
        return maxLength
    }
}