package org.code.PracticeYoutuber.Arrays;

/**
 * T: O(n)
 * S: O(1)
 */
public class isAnagram {
    class Solution {
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) return false;

            int[] charMap = new int[26];

            for (int i = 0; i < s.length(); i++) {
                charMap[s.charAt(i) - 'a']++;
                charMap[t.charAt(i) - 'a']--;
            }

            for (int map : charMap)
                if (map != 0) return false;

            return true;

        }
    }


}
