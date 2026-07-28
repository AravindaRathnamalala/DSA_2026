package dfs

class `Flood Fill` {

    fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, color: Int): Array<IntArray> {
        val ori = image[sr][sc]
        if (ori == color) return image
        dfs(image, sr, sc, color, ori)
        return image
    }

    fun dfs(image: Array<IntArray>, row: Int, col: Int, color: Int, ori: Int) {
        if (row !in image.indices || col !in image[0].indices) return

        if (image[row][col] != ori) return

        image[row][col] = color

        dfs(image, row-1, col, color, ori)
        dfs(image, row+1, col, color, ori)
        dfs(image, row, col-1, color, ori)
        dfs(image, row, col+1, color, ori)
    }
}