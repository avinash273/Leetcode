package Amazon;

import java.util.HashMap;
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

    /**
     * T: O(n)
     * S: O(n)
     */
    class Solution2 {
        public int lengthOfLongestSubstring(String s) {
            HashMap<Character, Integer> map = new HashMap<>();
            int max = 0;

            for(int i = 0, j = 0; i < s.length(); i++){
                if(map.containsKey(s.charAt(i))){
                    j = Math.max(j, map.get(s.charAt(i)) + 1);
                }
                map.put(s.charAt(i), i);
                max = Math.max(max, i - j + 1);
            }
            return max;
        }
    }
}
