package Strings

class `Add Strings` {

    fun addStrings(num1: String, num2: String): String {
        var i = num1.length - 1
        var j = num2.length - 1
        var carry = 0
        var stringBuilder = StringBuilder()

        while (i >= 0 || j >= 0 || carry != 0) {
            val num1 = if (i>= 0)num1[i]-'0' else 0
            val num2 = if (j>= 0)num2[j]-'0' else 0
            val num = num2 + num1 + carry
            stringBuilder.append(num%10)
            carry = num/10

            i--
            j--
        }

        return stringBuilder.toString().reversed()
    }
}

fun main () {
    print("LOG ---->:  ${`Add Strings`().addStrings("11", "132")}")
}