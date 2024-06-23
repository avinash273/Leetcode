package org.code.YoutuberKevin;

/**
 * T: O(n)
 * S: O(26)
 */
public class FirstUniqueCharacter {
    class Solution {
        public int firstUniqChar(String s) {
            int charFreq[] = new int[26];

            for (int i = 0; i < s.length(); i++)
                charFreq[s.charAt(i) - 'a']++;

            for (int i = 0; i < s.length(); i++) {
                if (charFreq[s.charAt(i) - 'a'] == 1)
                    return i;
            }
            return -1;
        }
    }

}
