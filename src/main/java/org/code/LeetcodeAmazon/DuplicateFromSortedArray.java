package org.code.LeetcodeAmazon;

/**
 * T: O(n)
 * S: O(1)
 * remember index starts from one
 */
public class DuplicateFromSortedArray {
    class Solution {
        public int removeDuplicates(int[] nums) {
            int index = 1;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] != nums[i + 1])
                    nums[index++] = nums[i + 1];
            }
            return index;
        }
    }
}
