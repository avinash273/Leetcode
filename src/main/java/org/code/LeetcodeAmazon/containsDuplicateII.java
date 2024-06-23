package org.code.LeetcodeAmazon;

import java.util.HashMap;

/**
 * T: O(n)
 * S: O(n)
 */

public class containsDuplicateII {
    class Solution {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

            if(nums == null || nums.length == 0)
                return false;

            int index = 0;
            for(int each: nums){
                if(map.containsKey(each)){
                    if((index - map.get(each)) <= k)
                        return true;
                }
                map.put(each, index);
                index++;
            }
            return false;
        }
    }
}
