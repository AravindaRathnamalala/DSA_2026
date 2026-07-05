package stack

class DailyTemperatures {

    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val arr = IntArray(temperatures.size)
        val stack = ArrayDeque<Int>()

        for (i in temperatures.indices) {

            while (stack.isNotEmpty() &&
            temperatures[i] > temperatures[stack.lastIndex]) {
                val prev = stack.removeLast()
                arr[prev] = i - prev
            }
            stack.addLast(i)
        }

        return arr
    }
}