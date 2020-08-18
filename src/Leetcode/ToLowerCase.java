package Leetcode;

/**
 * T: O(n)
 * S: O(n)
 */
public class ToLowerCase {
    class Solution {
        public String toLowerCase(String str) {
            //return str.toLowerCase();
            char[] a = str.toCharArray();
            for (int i = 0; i < a.length; i++) {
                if (a[i] >= 'A' && a[i] <= 'Z')
                    a[i] = (char) (a[i] - 'A' + 'a');
            }
            return new String(a);
        }
    }
}
