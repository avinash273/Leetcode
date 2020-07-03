package LeetcodeAmazon;

import java.util.*;

public class longestIncreasingSubsequence {

    /**
     * Time : O(n log n)
     * Time: O(n)
     */

    /**
     * Time : O(n^2)
     * Space: O(n)
     */
    class Solution {
        public int lengthOfLIS(int[] nums) {
            if(nums == null || nums.length == 0)
                return 0;

            int[] dp = new int[nums.length];
            Arrays.fill(dp, 1);

            int result = 0;

            for(int i = 0; i < nums.length; i++){
                for(int j = 0; j < i; j++){
                    if(nums[j] < nums[i])
                        dp[i] = Math.max(dp[i], dp[j] + 1);
                }
                result = Math.max(result, dp[i]);
            }
            return result;
        }
    }
}
