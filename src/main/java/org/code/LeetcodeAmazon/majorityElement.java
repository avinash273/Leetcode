package org.code.LeetcodeAmazon;

import java.util.HashMap;

/**
 * T: O(n)
 * S: O(n)
 */

public class majorityElement {
    class Solution {
        public int majorityElement(int[] nums) {
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
            int max = 0;
            int output = 0;
            for(int each:nums){
                if(!map.containsKey(each))
                    map.put(each,1);
                else
                    map.put(each, map.get(each)+1);
            }

            for(Integer key:map.keySet()){
                if(max < map.get(key)){
                    output = key;
                    max = map.get(key);
                }
            }
            return output;
        }
    }
}
