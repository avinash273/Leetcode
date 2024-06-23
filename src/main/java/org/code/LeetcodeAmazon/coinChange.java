package org.code.LeetcodeAmazon;

import java.util.Arrays;

/**
 * T: O(n)
 * S: O(n)
 */

public class coinChange {
    class Solution {
        public int coinChange(int[] coins, int amount) {
            int[] dp = new int[amount + 1];
            Arrays.fill(dp, amount + 1);

            dp[0] = 0;
            for(int i = 0; i <= amount; i++){
                for(int j = 0; j < coins.length; j++){
                    if(coins[j] <= i){
                        dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                    }
                }
            }
            return dp[amount] > amount ? -1 : dp[amount];
        }
    }
}
