package algo

import Node
import TreeNode

class DFS {

    fun dfsOnTree(root: TreeNode?) {

        if (root == null) return

        dfsOnTree(root.left)
        dfsOnTree(root.right)

    }

    fun dfsOnGraphRecursive(node: Int,
                   graph: Map<Int, List<Int>>,
                   visited: MutableSet<Int>) {
        if (node in visited) return
        visited.add(node)

        for (neighbour in graph[node] ?: emptyList()) {
            dfsOnGraphRecursive(neighbour, graph, visited)
        }
    }


    fun dfsOnGraphIterative(start: Int, graph: Map<Int, List<Int>>) {
        val stack = ArrayDeque<Int>()
        val visited  = mutableSetOf<Int>()

        while (stack.isNotEmpty()) {
            val node = stack.removeLast()

            if (node in visited) continue

            visited.add(node)

            for (neighbour in graph[node] ?: emptyList()) {
                stack.addLast(neighbour)
            }
        }

    }


    //BASE TEMPLATE

//    fun dfs(Node: Node) {
//
//        if (baseCase) return
//
//        for (neighbor in neighbors) {
//            dfs(neighbor)
//        }
//
//    }
}