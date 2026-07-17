package pqueue

import java.util.PriorityQueue

class KthLargest(private val k: Int, nums: IntArray) {

    val pq = PriorityQueue<Int>()

    init {
        for(num in nums) {
            add(num)
        }
    }

    fun add(`val`: Int): Int {
        pq.offer(`val`)
        if (pq.size > k) {
            pq.poll()
        }
        return pq.peek()
    }
}
