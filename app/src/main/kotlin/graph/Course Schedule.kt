package graph

class `Course Schedule` {

    fun canFinish(numCourses: Int, prerequisites: Array<IntArray>): Boolean {
        val graph = Array(numCourses){mutableListOf<Int>()}

        for (prerequisite in prerequisites) {
            val course = prerequisite[0]
            val prereq = prerequisite[1]
            graph[prereq].add(course)
        }

        val state = IntArray(numCourses){0}

        fun dfs(course: Int) : Boolean {
            if (state[course] == 1) return false
            if (state[course] == 2) return true
            state[course] = 1
            for (next in graph[course]) {
                if (!dfs(next)) return false
            }
            state[course] = 2
            return true
        }

        for (i in 0 until numCourses) {
            if (!dfs(i)) return false
        }

        return true
    }
}