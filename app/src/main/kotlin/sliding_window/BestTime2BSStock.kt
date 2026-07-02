package sliding_window

class BestTime2BSStock {
    fun maxProfit(prices: IntArray): Int {
        if (prices.isEmpty()) return 0
        var min = Int.MAX_VALUE
        var profit = 0
        for(price in prices) {
            min = minOf(min, price)
            profit = maxOf(profit, price - min)
        }
        return profit
    }
}