package two_pointers

class ContainerWithMostWater {

    fun maxArea(heights: IntArray): Int {
        var left = 0
        var right = heights.lastIndex
        var maxArea = 0

        while (left < right) {
            val width = right - left
            val currentArea = minOf(heights[left], heights[right]) * width

            maxArea = maxOf(maxArea, currentArea)

            if (heights[left] < heights[right]) {
                left++
            } else {
                right--
            }
        }
        return maxArea
    }
}