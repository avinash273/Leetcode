package org.code.Top75;

import java.util.HashSet;

/**
 * T: O(n)
 * S: O(n)
 */
public class containsDuplicate {
    class Solution {
        public boolean containsDuplicate(int[] nums) {
            HashSet<Integer> set = new HashSet<>();

            for(int num : nums){
                if(set.contains(num)) return true;
                else set.add(num);
            }
            return false;
        }
    }
}
