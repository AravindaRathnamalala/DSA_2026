package heap

import java.util.PriorityQueue
import kotlin.math.max

class `Last Stone Weight` {
    fun lastStoneWeight(stones: IntArray): Int {

        val maxHeap = PriorityQueue<Int>(compareByDescending { it })

        for(stone in stones) {
            maxHeap.offer(stone)
        }

        while(maxHeap.size > 1) {
            val x = maxHeap.poll()
            val y = maxHeap.poll()
            if (x!=y) maxHeap.offer(x-y)

        }

        return if (maxHeap.isEmpty()) 0 else maxHeap.poll()

    }
}

//Time:  O(n log n)
//Space: O(n)