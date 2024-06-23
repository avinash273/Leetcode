package org.code.LeetcodeAmazon;

import java.util.HashSet;

/**
 * Amazon 26 times
 * T: O(n)
 * S: O(n)
 */
public class longestSubstringWithoutRepeatingCharacters {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            HashSet<Character> set = new HashSet<>();
            if (s == null || s.length() <= 0)
                return 0;
            if (s.length() == 1)
                return 1;
            int count = 0;
            int maxCount = 0;
            int i = 0;

            while (i < s.length()) {
                if (!set.contains(s.charAt(i))) {
                    set.add(s.charAt(i));
                    count++;
                } else {
                    maxCount = Math.max(maxCount, count);
                    count = 0;
                    i -= set.size();
                    set.clear();
                }
                i++;
            }
            return Math.max(maxCount, count);
        }
    }
}
