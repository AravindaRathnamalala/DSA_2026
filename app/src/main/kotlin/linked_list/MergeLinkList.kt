package linked_list

import ListNode

class MergeLinkList {

    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var curr1 = list1
        var curr2 = list2
        val new = ListNode(0)
        var tail: ListNode = new


        while(curr1 != null && curr2 != null){
            when{
                curr1.`val` <= curr2.`val` ->{
                    tail.next = curr1
                    curr1 = curr1.next
                }
                else -> {
                        tail.next = curr2
                        curr2 = curr2.next
                }
            }
            tail = tail.next!!
        }
        tail.next = curr1 ?: curr2

        return new.next
    }
}

//Space O(4) -> O(1)
//Time O(n+m)