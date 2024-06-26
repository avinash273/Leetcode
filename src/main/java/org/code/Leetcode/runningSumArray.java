package org.code.Leetcode;

/**
 * T: O(n)
 * S: O(1)
 */
public class runningSumArray {
    class Solution {
        public int[] runningSum(int[] nums) {
            for (int i = 1; i < nums.length; i++) {
                nums[i] += nums[i - 1];
            }
            return nums;
        }
    }
}
