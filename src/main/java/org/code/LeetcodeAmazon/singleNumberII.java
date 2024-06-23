package org.code.LeetcodeAmazon;

import java.util.HashMap;

/**
 * T: O(n)
 * S: O(n)
 */

public class singleNumberII {
    class Solution {
        public int singleNumber(int[] nums) {
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

            for(int each: nums){
                if(!map.containsKey(each))
                    map.put(each,1);
                else
                    map.put(each,map.get(each)+1);
            }

            for(int each:map.keySet()){
                if(map.get(each) == 1)
                    return each;
            }
            return -1;
        }
    }
}
