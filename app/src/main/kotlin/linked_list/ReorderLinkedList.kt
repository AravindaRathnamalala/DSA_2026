package linked_list

import ListNode

class ReorderLinkedList {

    fun reorderList(head: ListNode?): Unit {

        if (head?.next == null) return

        var slow = head
        var fast = head

        //find middle
        while(fast?.next?.next != null) {
            slow = slow?.next
            fast = fast.next?.next
        }

        var secondPart = slow?.next
        slow?.next = null

        var prev: ListNode? = null
        //reverse 2nd part
        while (secondPart != null) {
            val next = secondPart.next
            secondPart.next = prev
            prev = secondPart
            secondPart = next

        }

        //merge
        var first = head
        secondPart = prev

        while (secondPart != null) {
            val temp1 = first?.next
            val temp2 = secondPart.next
            first?.next = secondPart
            secondPart.next = temp1

            first = temp1
            secondPart = temp2
        }
    }
}

//Time Complexity : O(n)
//Space Complexity :O(c) ~ O(1)