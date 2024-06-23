package org.code.LeetcodeAmazon;

/**
 * https://leetcode.com/problems/find-the-duplicate-number/
 * T: O(n)
 * S: O(1)
 * Floyd Tortoise and Hare cycle detection algorithm
 */
public class findTheDuplicateNumber {
    class Solution {
        public int findDuplicate(int[] nums) {
            int slow = nums[0];
            int fast = nums[0];

            slow = nums[slow];
            fast = nums[nums[fast]];

            while (slow != fast) {
                slow = nums[slow];
                fast = nums[nums[fast]];
            }

            int aSlow = nums[0];
            int bSlow = slow;

            while (aSlow != bSlow) {
                aSlow = nums[aSlow];
                bSlow = nums[bSlow];
            }
            return aSlow;
        }
    }
}
