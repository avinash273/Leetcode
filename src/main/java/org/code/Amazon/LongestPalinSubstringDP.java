package org.code.Amazon;

public class LongestPalinSubstringDP {
    /**
     * T: O(n^2)
     * S: O(n^2)
     */
    class Solution {
        public String longestPalindrome(String s) {
            if (s.length() <= 1) return s;

            int len = s.length();
            int start = 0;
            int longest = 1;

            boolean[][] dp = new boolean[len][len];

            //base case
            for (int i = 0; i < len; i++)
                dp[i][i] = true;

            for (int i = len - 1; i >= 0; i--) {
                for (int dist = 1; dist < len - i; dist++) {
                    int j = dist + i;
                    dp[i][j] = (dist == 1) ? s.charAt(i) == s.charAt(j) : (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]);

                    if (dp[i][j] && j - i + 1 > longest) {
                        longest = j - i + 1;
                        start = i;
                    }
                }
            }
            return s.substring(start, start + longest);
        }
    }
}
