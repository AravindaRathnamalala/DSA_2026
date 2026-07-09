package stack

class NextGreaterElementOne {

    fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {

        val stack = ArrayDeque<Int>()
        val map = HashMap<Int, Int>()

        for (num in nums2) {
            while(stack.isNotEmpty() && num > nums2[stack.last()]) {
                map[stack.removeLast()] = num
            }
            stack.addLast(num)
        }

        while(stack.isNotEmpty()) {
            map[stack.removeLast()] = -1
        }

        return IntArray(nums1.size){
            i ->
            map[nums1[1]]!!
        }
    }

}