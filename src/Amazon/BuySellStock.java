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
