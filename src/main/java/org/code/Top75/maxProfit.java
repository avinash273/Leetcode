package org.code.Top75;

/**
 * T: O(n)
 * S: O(1)
 */
public class maxProfit {
    class Solution {
        public int maxProfit(int[] prices) {
            int min = Integer.MAX_VALUE;
            int profit = 0;

            for (int price : prices) {
                if (price < min) min = price;
                else if (price - min > profit) profit = price - min;
            }
            return profit;
        }
    }
}
