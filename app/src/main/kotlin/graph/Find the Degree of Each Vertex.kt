package graph

//Input: matrix = [[0,1,1],[1,0,1],[1,1,0]]
//Output: [2,2,2]
class `Find the Degree of Each Vertex` {

    fun findDegrees(matrix: Array<IntArray>): IntArray {

        val sizeOfArray = matrix.size
        val result = IntArray(sizeOfArray)

        for (i in 0 until  sizeOfArray) {
            var degree = 0
            matrix[i].forEach { value ->
                degree += value
            }
            result[i] = degree
        }

        return result
    }
}