package org.code.PracticeYoutuber.Top75.Dynamic;

/**
 * T: O(n)
 * S: O(n)
 */
public class ClimbStairs {
    class Solution {
        public int climbStairs(int n) {
            int dp[] = new int[n + 1];
            dp[0] = 1;
            dp[1] = 1;

            for (int i = 2; i <= n; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
            return dp[n];
        }
    }
}
