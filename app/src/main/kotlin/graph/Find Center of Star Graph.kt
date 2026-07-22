package graph

class `Find Center of Star Graph` {

    fun findCenter(edges: Array<IntArray>): Int {

        val a = edges[0][0]
        val b = edges[0][1]

        return if (edges[1][0] == a || edges[1][0] == b) edges[1][0] else edges[1][1]
    }
}