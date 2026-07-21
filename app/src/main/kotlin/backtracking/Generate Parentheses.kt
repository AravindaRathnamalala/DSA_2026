package backtracking

class `Generate Parentheses` {

    fun generateParenthesis(n: Int): List<String> {
        val result = mutableListOf<String>()

        fun backtracking(current: String, open: Int, close: Int) {

            if (current.length == 2*n) {
                result.add(current)
                return
            }

            if (open < n){
                backtracking(current + "(", open + 1, close)
            }

            if (close < open){
                backtracking(current + ")", open, close + 1)

            }

        }

        backtracking("", 0, 0)
        return result
    }
}