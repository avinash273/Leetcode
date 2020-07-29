package Top75;

import java.util.Arrays;

/**
 * T: O(n^2)
 * S: O(n)
 */
public class longestIncreasingSubsequence {
    class Solution {
        public int lengthOfLIS(int[] nums) {
            if (nums == null || nums.length <= 0) return 0;
            int[] dp = new int[nums.length];
            Arrays.fill(dp, 1);
            int maxCount = 0;

            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < i; j++) {
                    if (nums[j] < nums[i])
                        dp[i] = Math.max(dp[i], dp[j] + 1);
                }
                maxCount = Math.max(maxCount, dp[i]);
            }
            return maxCount;
        }
    }
}
