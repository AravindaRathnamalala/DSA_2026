package arrays_and_hashing

class `Intersection of Two Arrays` {

    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val set = nums1.toHashSet()
        val result = HashSet<Int>()

        for (num in nums2) {
            if (set.contains(num)) {
                result.add(num)
            }
        }

        return result.toIntArray()
    }
}