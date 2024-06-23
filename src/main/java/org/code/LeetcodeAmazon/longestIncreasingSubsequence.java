package org.code.LeetcodeAmazon;

import java.util.Arrays;

public class longestIncreasingSubsequence {

    /**
     * Time : O(n log n)
     * Time: O(n)
     * dynamic prog with binary search
     */
    class Solution {
        public int lengthOfLIS(int[] nums) {
            if(nums == null || nums.length == 0)
                return 0;
            int len = 0;
            int[] dp =  new int[nums.length];

            for(int num : nums){
                int index = Arrays.binarySearch(dp, 0, len, num);
                if(index < 0)
                    index = -(index + 1);
                dp[index] = num;
                if(index == len)
                    len++;
            }
            return len;
        }
    }


    /**
     * Time : O(n^2)
     * Space: O(n)
     */
    class Solution2 {
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
