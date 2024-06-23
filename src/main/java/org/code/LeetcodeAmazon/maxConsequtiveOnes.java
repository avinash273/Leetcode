package org.code.LeetcodeAmazon;

/**
 * T: O(n)
 * S: (1)
 */

public class maxConsequtiveOnes {
    class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int count = 0;

            int maxCount = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 1)
                    count++;
                else {
                    maxCount = Math.max(maxCount, count);
                    count = 0;
                }
            }
            return Math.max(maxCount, count);
        }
    }
}
