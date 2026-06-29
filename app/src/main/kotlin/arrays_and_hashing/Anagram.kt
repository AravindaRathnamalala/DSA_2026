package arrays_and_hashing

class Anagram {

    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = hashMapOf<String, MutableList<String>>()
        strs.forEach {
            str ->
            val key = str.toCharArray().sorted().joinToString("")
            map.getOrPut(key) {
                mutableListOf()
            }.add(str)
        }
        return map.values.toList()
    }
}