package linked_list

class `Find the Duplicate Number` {

    fun findDuplicate(nums: IntArray): Int {
        var slow  = nums[0]
        var fast = nums[0]

        do {
            slow = nums[slow]
            fast = nums[nums[fast]]
        } while (slow != fast)
        var ptr1 = slow
        var ptr2 = nums[0]

        while(ptr1 != ptr2) {
            ptr1 = nums[ptr1]
            ptr2 = nums[ptr2]
        }
        return ptr2
    }
}