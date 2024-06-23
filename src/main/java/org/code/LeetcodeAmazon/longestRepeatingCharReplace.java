package org.code.LeetcodeAmazon;

/**
 * T: O(n^2)
 * S: O(26)
 */
public class longestRepeatingCharReplace {
    class Solution {
        public int characterReplacement(String s, int k) {
            int n = s.length();
            int start = 0;
            int maxLength = 0;
            int maxCount = 0;
            int[] charCount = new int[26];

            for (int end = 0; end < n; end++) {
                charCount[s.charAt(end) - 'A']++;
                maxCount = Math.max(maxCount, charCount[s.charAt(end) - 'A']);

                while (end - start - maxCount + 1 > k) {
                    charCount[s.charAt(start) - 'A']--;
                    start++;
                }
                maxLength = Math.max(maxLength, end - start + 1);
            }
            return maxLength;
        }
    }
}
