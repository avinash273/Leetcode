package org.code.LeetcodeAmazon;

/**
 * This is very easy question. But, couldn't do it on my own.
 * T: O(n)
 * S: O(1)
 */

public class stringCompression {
    class Solution {
        public int compress(char[] chars) {
            int index = 0;
            int i = 0;

            while (i < chars.length) {
                int j = i;
                while (j < chars.length && chars[j] == chars[i]) {
                    j++;
                }
                chars[index++] = chars[i];
                if (j - i > 1) {
                    String Count = j - i + "";
                    for (char c : Count.toCharArray())
                        chars[index++] = c;
                }
                i = j;
            }
            return index;
        }
    }
}
