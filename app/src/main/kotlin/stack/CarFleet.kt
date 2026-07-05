package stack

class CarFleet {
    fun carFleet(target: Int, position: IntArray, speed: IntArray): Int {
        val carMap = position.indices
            .map { position[it] to speed[it] }
            .sortedByDescending { it.first }

        val stack = ArrayDeque<Double>()

        for((position, speed) in carMap) {
            val time = (target - position).toDouble() / speed
            if (stack.isEmpty() || time > stack.last()) {
                stack.addLast(time)
            }
        }
        return stack.size
    }
}