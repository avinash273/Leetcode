package org.code.LeetcodeAmazon;

/**
 * T: O(n)
 * S: O(n)
 * https://leetcode.com/problems/reverse-only-letters/
 * easy, but important idea, so do again
 */

public class reverseLetterOnly {
    class Solution {
        public String reverseOnlyLetters(String S) {
            char[] chars = S.toCharArray();
            int i = 0;
            int j = S.length() - 1;

            while(i < j){
                //until you find a letter, move i to right
                while(i < j && !Character.isLetter(S.charAt(i))){
                    i++;
                }
                //until you find letter, move j to left
                while( j > i && !Character.isLetter(S.charAt(j))){
                    j--;
                }
                //if you found at i and j, then swap
                char temp = chars[i];
                chars[i++] = chars[j];
                chars[j--] = temp;
            }
            //convert to string and return
            return new String(chars);
        }
    }
}
