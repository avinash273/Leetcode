package org.code.Amazon;

import java.util.HashMap;

/**
 * T: O(∣S∣+∣T∣) where |S| and |T| represent the lengths of strings
 * S: O(∣S∣+∣T∣)
 */
public class MinimumWindowSubstring {
    class Solution {
        //https://www.youtube.com/watch?v=nMaKzLWceFg&ab_channel=PrakashShukla
        public String minWindow(String s, String t) {
            if (s.length() == 0 || s.length() < t.length()) return "";
            HashMap<Character, Integer> map = new HashMap<>();

            for (char c : t.toCharArray())
                map.put(c, map.getOrDefault(c, 0) + 1);

            int count = 0;
            int start = 0;
            int minLength = Integer.MAX_VALUE;
            int minLeft = 0;

            for (int i = 0; i < s.length(); i++) {
                if (map.containsKey(s.charAt(i))) {
                    map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                    if (map.get(s.charAt(i)) >= 0)
                        count++;
                }


                while (count == t.length()) {
                    if (minLength > i - start + 1) {
                        minLength = i - start + 1;
                        minLeft = start;
                    }
                    if (map.containsKey(s.charAt(start))) {
                        map.put(s.charAt(start), map.get(s.charAt(start)) + 1);
                        if (map.get(s.charAt(start)) > 0)
                            count--;
                    }
                    start++;
                }
            }
            if (minLength > s.length()) return "";
            return s.substring(minLeft, minLeft + minLength);
        }
    }
}
