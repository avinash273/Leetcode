package org.code.LeetcodeAmazon;

import java.util.HashMap;

/**
 * T: O(n)
 * S: O(n)
 */

public class firstUniqueCharacter {
    class Solution {
        public int firstUniqChar(String s) {
            if(s == null || s.length() <=0)
                return -1;

            HashMap<Character, Integer> map = new HashMap<Character, Integer>();
            char[] letter = s.toCharArray();

            int i = 0;

            for(char each:letter){
                if(!map.containsKey(each))
                    map.put(each,i);
                else
                    map.put(each, -1);
                i++;
            }

            int minValue = Integer.MAX_VALUE;
            for(Character key:map.keySet()){
                if(map.get(key) != -1)
                    minValue = Math.min(minValue, map.get(key));
            }
            if(minValue == Integer.MAX_VALUE)
                return -1;

            return minValue;

        }
    }
}
