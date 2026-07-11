package linked_list

import ListNode

class `Add Two Numbers` {

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val head = ListNode(0)
        var tempNode: ListNode = head
        var carry: Int = 0
        var list1 = l1
        var list2 = l2

        while (list1 != null || list2 != null || carry != 0) {
            val value = (list1?.`val` ?: 0 )+ (list2?.`val` ?: 0) + carry
            carry = value/10
            tempNode.next = ListNode(value % 10)
            tempNode = tempNode.next!!
            list1 = list1?.next
            list2 = list2?.next

        }

        return head.next
    }
}