package org.code.PracticeYoutuber.Bitwise;

/**
 * T: O(n)
 * S: O(1)
 */
public class SingleNumber136 {
    class Solution {
        public int singleNumber(int[] nums) {
            int a = 0;
            for (int num : nums)
                a = a ^ num;
            return a;
        }
    }
}
