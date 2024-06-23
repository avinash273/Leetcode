package org.code.LeetcodeAmazon;

/**
 * T: O(n)
 * S: O(1)
 * https://leetcode.com/problems/split-a-string-in-balanced-strings/submissions/
 * simple question, requires little insight
 */

public class splitBalancedString {
    class Solution {
        public int balancedStringSplit(String s) {
            int count = 0;
            int balance = 0;

            for(int i = 0; i < s.length(); i++){
                char letter = s.charAt(i);
                if(letter == 'L')
                    balance++;
                else if(letter == 'R')
                    balance--;
                if(balance == 0)
                    count++;
            }
            return count;
        }
    }
}
