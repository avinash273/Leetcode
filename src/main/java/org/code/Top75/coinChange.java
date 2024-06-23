package org.code.Top75;

import java.util.Arrays;

/**
 * T: O(m * n)
 * S: O(n)
 * n -> amount
 * m -> coins
 */

/**
 * updated one after trying sort solution 2
 * T: O(mn) + O(m log m)
 * S: O(n)
 */
public class coinChange {
    class Solution {
        public int coinChange(int[] coins, int amount) {
            int[] dp = new int[amount + 1];
            Arrays.fill(dp, amount + 1);

            //bottom up processing
            dp[0] = 0;

            for (int i = 0; i <= amount; i++) {
                for (int j = 0; j < coins.length; j++) {
                    if (coins[j] <= i) {
                        dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
                    }
                }
            }
            return dp[amount] > amount ? -1 : dp[amount];
        }
    }

    class Solution2 {
        public int coinChange(int[] coins, int amount) {
            int[] dp = new int[amount + 1];
            Arrays.fill(dp, amount + 1);
            Arrays.sort(coins);
            //bottom up processing
            dp[0] = 0;

            for (int i = 0; i <= amount; i++) {
                for (int j = 0; j < coins.length; j++) {
                    if (coins[j] <= i) {
                        dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
                    } else {
                        break;
                    }
                }
            }
            return dp[amount] > amount ? -1 : dp[amount];
        }
    }
}
