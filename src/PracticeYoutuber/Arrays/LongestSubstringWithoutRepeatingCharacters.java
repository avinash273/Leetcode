package PracticeYoutuber.Arrays;

import java.util.HashSet;

/**
 * T: O(n^2)
 * S: O(n)
 */
public class LongestSubstringWithoutRepeatingCharacters {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            int i = 0;
            int j = 0;
            int maxCount = 0;
            int count = 0;

            HashSet<Character> set = new HashSet<>();

            while (i < s.length() && j < s.length()) {
                if (!set.contains(s.charAt(i))) {
                    set.add(s.charAt(i++));
                    count++;
                } else {
                    set.clear();
                    count = 0;
                    j++;
                    i = j;
                }
                maxCount = Math.max(maxCount, count);
            }
            return maxCount;
        }
    }
}
