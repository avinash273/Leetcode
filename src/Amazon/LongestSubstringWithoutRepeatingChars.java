package Amazon;

import java.util.HashSet;
import java.util.Set;

/**
 * T: O(n^2)
 * S: O(n)
 */
public class LongestSubstringWithoutRepeatingChars {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            Set<Character> set = new HashSet<>();

            int result = 0;
            int maxValue = 0;
            int i = 0;
            int j = 0;

            while (i < s.length() && j < s.length()) {
                if (!set.contains(s.charAt(i))) {
                    set.add(s.charAt(i));
                    result++;
                    i++;
                    maxValue = Math.max(result, maxValue);
                } else {
                    result = 0;
                    set.clear();
                    j++;
                    i = j;
                }
            }
            return maxValue;
        }
    }
}
