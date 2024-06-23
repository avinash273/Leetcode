package org.code.LeetcodeAmazon;

import java.util.HashSet;

public class singleNumber {
    /**
     * T: O(n)
     * S: O(n)
     */
    class Solution {
        public int singleNumber(int[] nums) {
            HashSet<Integer> set = new HashSet<Integer>();

            for (Integer each : nums) {
                if (set.contains(each))
                    set.remove(each);
                else
                    set.add(each);
            }

            for (int i : set)
                return i;

            return -1;
        }
    }
}
