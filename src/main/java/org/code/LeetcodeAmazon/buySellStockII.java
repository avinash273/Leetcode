package org.code.LeetcodeAmazon;

/**
 * T: O(n)
 * S: O(1)
 */

public class buySellStockII {
    class Solution {
        public int maxProfit(int[] prices) {
            int maxProfit = 0;

            for(int i = 1; i < prices.length; i++){
                if(prices[i] > prices[i - 1]){
                    maxProfit += prices[i] - prices[i -1];
                }
            }
            return maxProfit;
        }
    }
}
