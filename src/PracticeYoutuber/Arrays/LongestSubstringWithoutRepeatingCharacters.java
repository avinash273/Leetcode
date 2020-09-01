package PracticeYoutuber.Arrays;

import java.util.HashMap;
import java.util.HashSet;

/**
 * T: O(n^2)
 * S: O(n)
 * bad solution
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

    /**
     * T: O(n)
     * S: O(n)
     * better solution is to used a int array map
     * still, I have not understood this solution
     */
    class Solution2 {
        public int lengthOfLongestSubstring(String s) {
            HashMap<Character, Integer> map = new HashMap<>();

            int max = 0;

            for (int i = 0, j = 0; i < s.length(); i++) {
                if (map.containsKey(s.charAt(i)))
                    j = Math.max(j, map.get(s.charAt(i)) + 1);

                map.put(s.charAt(i), i);
                max = Math.max(max, i - j + 1);
            }
            return max;
        }
    }
}
