package stack

class FinalPricesWithASpecialDiscountInAShop {



    fun finalPrices(prices: IntArray): IntArray {
        val arr = prices.copyOf()
        val stack = ArrayDeque<Int>()

        for (i in prices.indices) {

            while (stack.isNotEmpty() && prices[i] <= prices[stack.last()]) {
                val index = stack.removeLast()
                arr[index] -= prices[i]
            }
            stack.add(i)

        }
        return arr
    }

    //Time : O(n)
    //Space : O(n)
}