package algo

import TreeNode

class BFS {

    fun bfsOnTree(root: TreeNode) {
        if (root.left != null) return
        val queue = ArrayDeque<TreeNode>()
        queue.add(root)
        while (queue.isNotEmpty()) {
            val node = queue.removeFirst()
            node.left?.let { queue.add(it) }
            node.right?.let { queue.add(it) }
        }
    }

    /**If the problem asks:

    Level order traversal
    Right side view
    Average of levels
    Zigzag traversal

     **/
    fun levelOrderTraversal(root: TreeNode) : List<List<Int>> {

        val queue = ArrayDeque<TreeNode>()
        val result = mutableListOf<List<Int>>()

        queue.add(root)

        while (queue.isNotEmpty()) {
            val size = queue.size
            val level = mutableListOf<Int>()
            repeat(size) {
                val node = queue.removeFirst()
                level.add(node.`val`)
                node.left?.let { queue.add(it) }
                node.right?.let { queue.add(it) }
            }
            result.add(level)
        }
        return result
    }

    fun bfsOnGraph(
        start: Int,
        graph: Map<Int, List<Int>>
    ) {

        val queue = ArrayDeque<Int>()
        val visited = mutableSetOf<Int>()

        queue.addLast(start)
        visited.add(start)

        while (queue.isNotEmpty()) {
            val node = queue.removeFirst()
            for (neighbour in graph[node] ?: emptyList()) {
                if (neighbour !in visited) {
                    queue.addLast(neighbour)
                    visited.add(neighbour)
                }
            }
        }
    }


//    fun bfsOnGrid(
//        row: Int,
//        col: Int,
//        grid: Array<CharArray>
//    ) {
//        val queue = ArrayDeque<Pair<Int, Int>>()
//        queue.addLast(row to col)
//
//        while (queue.isNotEmpty()) {
//            val (r, c) = queue.removeFirst()
//            for ( (dr, dc) in directions)
//        }
//    }


}