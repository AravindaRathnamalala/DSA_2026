package graph

class `Find the Town Judge` {

    fun findJudge(n: Int, trust: Array<IntArray>): Int {
        val inDegree = IntArray(n + 1)
        val outDegree = IntArray(n + 1)

        for((i, j) in trust) {
            inDegree[j]++
            outDegree[i]++
        }

        for (person in 1 .. n){
            if(inDegree[person]  == n-1 && outDegree[person] == 0) return person
        }

        return -1
    }

}