package dfs

class Node(var `val`: Int) {
         var children: List<Node?> = listOf()
}

class `Maximum Depth of N-ary Tree` {

    fun maxDepth(root: Node?): Int {
        var depth = 0

        if (root == null) return 0

        for (child in  root.children) {
            depth = maxOf(depth, maxDepth(child))
        }

        return 1 + depth

    }
}