package org.code.LeetcodeAmazon;

import java.util.HashMap;

/**
 * T: O(n)
 * S: T(n+m)
 */
public class findCharDifference {
    class Solution {
        public char findTheDifference(String s, String t) {
            HashMap<Character, Integer> map = new HashMap<Character, Integer>();

            if (s == null && t == null)
                return '0';

            for (char eachS : s.toCharArray()) {
                if (map.containsKey(eachS))
                    map.put(eachS, map.get(eachS) + 1);
                else
                    map.put(eachS, 1);
            }

            for (char eachT : t.toCharArray()) {
                if (map.containsKey(eachT))
                    map.put(eachT, map.get(eachT) - 1);
                else
                    map.put(eachT, 1);
            }

            for (Character c : map.keySet()) {
                if (map.get(c) != 0)
                    return c;
            }
            return '0';
        }
    }
}
