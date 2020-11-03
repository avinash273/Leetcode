package Amazon;

/**
 * T: O(n)
 * S: O(1)
 */
public class BuySellStock {
    class Solution {
        public int maxProfit(int[] prices) {
            int maxProfit = 0;
            int minPrice = Integer.MAX_VALUE;

            for (int price : prices) {
                minPrice = Math.min(minPrice, price);
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
            return maxProfit;
        }
    }
}

/**
 minPrice is the minimum price from day 0 to day i. And maxPro is the maximum profit we can get from day 0 to day i.

 How to get maxPro?
 Just get the larger one between current maxPro and prices[i] - minPrice.
 **/