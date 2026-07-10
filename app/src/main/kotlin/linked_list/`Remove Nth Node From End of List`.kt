package linked_list

import ListNode

class `Remove Nth Node From End of List` {

    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        if (head == null) return null
        val dummy = ListNode(0)
        dummy.next = head

        var slow: ListNode?  = dummy
        var fast: ListNode? = dummy
        repeat(n+1) {
            fast = fast?.next
        }

        while (fast != null) {
            fast = fast.next
            slow = slow?.next
        }

        slow?.next = slow?.next?.next

        return dummy.next

    }

}

//Time Complexity: O(n)
//Space Complexity: O(1)