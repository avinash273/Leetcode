package org.code.LeetcodeAmazon;

public class LongestPalindrome {
    class Solution {
        public int longestPalindrome(String s) {
            int[] charCounts = new int[128];
            int result = 0;

            for (char c : s.toCharArray())
                charCounts[c]++;
            for (int count : charCounts) {
                result += count / 2 * 2;
                if (result % 2 == 0 && count % 2 == 1) {
                    result += 1;
                }
            }

            return result;
        }
    }
}
