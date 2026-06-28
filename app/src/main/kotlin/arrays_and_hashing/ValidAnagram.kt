package arrays_and_hashing

class ValidAnagram {
    fun isAnagram(s: String, t: String): Boolean {
       val map = hashMapOf<Char, Int>()
        if (s.length != t.length) return false

        for (c in s) {
            map[c] = map.getOrDefault(c, 0) + 1
        }

        for (c in t) {
            val count = map.getOrDefault(c, 0)
            if (count == 0) return false
            map[c] = count - 1
        }

        return true

    }
}

