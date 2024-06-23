package org.code.YoutuberKevin;

/**
 * T : O(n)
 * S : O(1)
 */
public class ReverseString {
    class Solution {
        public void reverseString(char[] s) {
            int left = 0;
            int right = s.length - 1;

            while (left < right) {
                char tmp = s[left];
                s[left++] = s[right];
                s[right--] = tmp;
            }
        }
    }


}
