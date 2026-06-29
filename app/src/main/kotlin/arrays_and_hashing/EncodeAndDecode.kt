package arrays_and_hashing

class EncodeAndDecode {

    fun encode(strs: List<String>): String {
        val sb = StringBuilder()
        for (s in strs) {
            sb.append(s.length)
            sb.append("#")
            sb.append(s)
        }

        return sb.toString()

    }

    fun decode(str: String): List<String> {
        val list = mutableListOf<String>()
        var i = 0

        while (i < str.length) {
            val j = str.indexOf('#', i)
            val len = str.substring(i, j).toInt()
            list.add(str.substring(j + 1, j + 1 + len))
            i = j + 1 + len
        }

        return list
    }
}