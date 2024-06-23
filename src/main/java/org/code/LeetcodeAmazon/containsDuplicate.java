package org.code.LeetcodeAmazon;

import java.util.HashSet;

public class containsDuplicate {
    class Solution {
        public boolean containsDuplicate(int[] nums) {
            HashSet<Integer> set = new HashSet<Integer>();

            for(int each: nums){
                if(set.contains(each))
                    return true;
                else
                    set.add(each);
            }
            return false;
        }
    }
}

