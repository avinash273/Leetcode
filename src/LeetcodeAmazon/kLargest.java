package LeetcodeAmazon;

import java.util.Arrays;

/**
 * Bad Solution, not interview worth
 * T: O(n log n)
 * S: O(1)
 */
public class kLargest {
    class Solution {
        public int findKthLargest(int[] nums, int k) {
            Arrays.sort(nums);
            return nums[nums.length - k];
        }
    }
}
