package org.code.PracticeYoutuber.Arrays;

/**
 * T: O(n)
 * S: O(1)
 */
public class BuySellStock121 {
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

    class Solution2 {
        public int maxProfit(int[] prices) {
            int max = 0;
            int min = Integer.MAX_VALUE;

            for(int price : prices){
                if(price < min)
                    min = price;
                else{
                    max = Math.max(max, price - min);
                }
            }
            return max;
        }
    }
}
