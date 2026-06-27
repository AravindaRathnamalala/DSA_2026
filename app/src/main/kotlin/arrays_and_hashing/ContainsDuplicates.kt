package arrays_and_hashing

class ContainsDuplicates {

    fun hasDuplicate(nums: IntArray): Boolean {
        val hMap = hashMapOf<Int, Int>()
        nums.forEach {
            if (hMap.containsKey(it)) {
                return true
            }
            hMap[it]=1
        }
        return false
    }

}

