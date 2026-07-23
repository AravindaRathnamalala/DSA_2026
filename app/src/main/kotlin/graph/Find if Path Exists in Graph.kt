package graph

class `Find if Path Exists in Graph` {

    fun validPath(n: Int, edges: Array<IntArray>, source: Int, destination: Int): Boolean {

        val graph = Array(n) { mutableListOf<Int>()}

        //build adjacency list
        for (edge in edges) {
            graph[edge[0]].add(edge[1])
            graph[edge[1]].add(edge[0])
        }

        val visited = BooleanArray(n)

        fun dfs(node: Int) : Boolean {
            if (node == destination) return true
            visited[node] = true

            for (neighbor in graph[node]) {
                if (!visited[neighbor] && dfs(neighbor)) {
                    return true
                }
            }
            return false
        }
        return dfs(source)
    }
}