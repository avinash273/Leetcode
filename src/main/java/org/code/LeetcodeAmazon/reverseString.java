package org.code.LeetcodeAmazon;

/**
 * T: O(n)
 * S: O(1)
 */

public class reverseString {
    class Solution {
        public void reverseString(char[] s) {

            int i = 0;
            int j = s.length-1;
            char temp;
            while(i <= j){
                temp = s[i];
                s[i] = s[j];
                s[j] = temp;
                i++;
                j--;
            }
        }
    }
}
