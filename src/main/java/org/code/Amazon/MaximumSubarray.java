package org.code.Amazon;

/**
 * T: O(n)
 * S: O(1)
 */
public class MaximumSubarray {
    class Solution {
        public int maxSubArray(int[] nums) {
            int n = nums.length;
            if (nums == null || n == 0) return 0;

            int currSum = nums[0];
            int maxSum = nums[0];

            for (int i = 1; i < n; i++) {
                currSum = Math.max(nums[i], nums[i] + currSum);
                maxSum = Math.max(maxSum, currSum);
            }
            return maxSum;
        }
    }
}
