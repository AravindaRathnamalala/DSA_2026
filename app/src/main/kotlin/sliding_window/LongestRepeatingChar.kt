package sliding_window

class LongestRepeatingChar {
    fun characterReplacement(s: String, k: Int): Int {
        var maxWindow = 0
        var answer = 0
        var left = 0
        var map = hashMapOf<Char, Int>()
        if (s.isEmpty()) return 0
        if (s.length == 1) return 1
        for (right in s.indices) {
            val ch = s[right]
            map[ch] = map.getOrDefault(ch, 0) + 1
            maxWindow = maxOf(maxWindow, map[ch]!!)

            while ((right - left + 1) - maxWindow > k) {
                val leftCh = s[left]
                map[leftCh] = map[leftCh]!! -1
                left++
            }

            answer = maxOf(answer, right - left + 1)
        }
        return answer

    }
}