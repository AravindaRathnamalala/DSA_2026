package linked_list

import ListNode

class LinkedListCycleDetection {

    fun hasCycle(head: ListNode?): Boolean {

        var slow = head
        var fast = head
        while(fast?.next != null) {

            fast = fast.next?.next
            slow = slow?.next

            if (fast == slow && slow != null) return true
        }

        return false

    }
}