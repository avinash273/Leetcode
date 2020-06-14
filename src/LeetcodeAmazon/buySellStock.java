package LeetcodeAmazon;

/**
 * T: O(n)
 * S: O(1)
 */
public class buySellStock {
    class Solution {
        public int maxProfit(int[] prices) {
            if(prices == null || prices.length <=1)
                return 0;

            int max = 0;
            int min = Integer.MAX_VALUE;

            for(int i=0; i < prices.length; i++){
                if(prices[i] < min){
                    min = prices[i];
                }
                else
                    max = Math.max(max, prices[i] - min);
            }
            return max;
        }
    }
}
