package org.code.Amazon;

import java.util.HashMap;

/**
 * T: O(n)
 * S: O(n)
 */
public class FirstUniqueCharacterString {
    class Solution {
        public int firstUniqChar(String s) {
            HashMap<Character, Integer> map = new HashMap<>();

            for (char each : s.toCharArray())
                map.put(each, map.getOrDefault(each, 0) + 1);

            for (int i = 0; i < s.length(); i++) {
                if (map.get(s.charAt(i)) == 1)
                    return i;
            }
            return -1;
        }
    }
}
