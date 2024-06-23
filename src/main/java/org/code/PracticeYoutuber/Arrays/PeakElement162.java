package org.code.PracticeYoutuber.Arrays;

/**
 * T: O(n)
 * S: O(1)
 */
public class PeakElement162 {
    public class Solution {
        public int findPeakElement(int[] nums) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1])
                    return i;
            }
            return nums.length - 1;
        }
    }
}
