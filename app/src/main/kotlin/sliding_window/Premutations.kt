package sliding_window

class Premutations {

    fun checkInclusion(s1: String, s2: String): Boolean {
        if (s1.length > s2.length) return false
        val hMap = HashMap<Char, Int>()
        s1.toCharArray().forEach {
            hMap[it] = hMap.getOrDefault(it, 0) + 1
        }
        for (left in 0 until  s2.length-s1.length){
            val map = HashMap<Char, Int>()
            s2.substring(left, left+s1.length).forEach {
                map[it] = map.getOrDefault(it, 0) + 1
            }
            if (map == hMap) return true
        }
        return false
    }

    fun checkInclusion1(s1: String, s2: String): Boolean {
        if (s1.length > s2.length) return false
        val s1Count = IntArray(26)
        val windowCount = IntArray(26)

        for (i in 0 until  s1.length) {
            s1Count[s1[i]- 'a']++
            windowCount[s2[i]- 'a']++
        }

        if (s1Count.contentEquals(windowCount)) return true

        for (right in s1.length until s2.length) {
            val left = right - s1.length

            windowCount[s2[left] - 'a']--
            windowCount[s2[right] - 'a']++

            if (s1Count.contentEquals(windowCount)) return true
        }

        return false

    }
}