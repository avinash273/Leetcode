package LeetcodeAmazon;

/**
 * T: O(n^2)
 * S: O(n)
 */
public class rotateString {
    class Solution {
        public boolean rotateString(String A, String B) {
            return (A.length() == B.length()) && (A + A).contains(B);
        }
    }
}
