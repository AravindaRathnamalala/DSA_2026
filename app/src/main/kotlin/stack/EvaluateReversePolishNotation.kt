package stack

class EvaluateReversePolishNotation {

    fun evalRPN(tokens: Array<String>): Int {
        val stack = ArrayDeque<Int>()
        for (token in tokens){
            when (token) {
                "+" -> {
                    val value1 = stack.removeLast()
                    val value2 = stack.removeLast()
                    stack.addLast(value1 + value2)

                }
                "-" -> {
                    val value1 = stack.removeLast()
                    val value2 = stack.removeLast()
                    stack.addLast(value2 - value1)

                }
                "*" -> {
                    val value1 = stack.removeLast()
                    val value2 = stack.removeLast()
                    stack.addLast(value2 * value1)
                }
                "/" -> {
                    val value1 = stack.removeLast()
                    val value2 = stack.removeLast()
                    stack.addLast(value2 / value1)
                }
                else -> stack.addLast(token.toInt())
            }
        }
        return stack.last()
    }
}