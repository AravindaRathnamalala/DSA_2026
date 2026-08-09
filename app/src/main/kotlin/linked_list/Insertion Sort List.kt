package linked_list

import ListNode

class `Insertion Sort List` {

    fun insertionSortList(head: ListNode?): ListNode? {
        val dummy = ListNode(0)
        var current = head

        while (current != null) {
            val next = current.next
            var prev = dummy

            while (prev.next != null && prev.next!!.`val` < current.`val`) {
                prev = prev.next!!
            }
            current.next = prev.next
            prev.next = current
            current = next
        }

        return dummy.next

    }
}