package LeetcodeAmazon;

/**
 * T: O(n)
 * S: O(128)
 */
public class palindromePermutation {
    class Solution {
        public boolean canPermutePalindrome(String s) {
            int[] charCounts = new int[128];
            for (int i = 0; i < s.length(); i++) {
                charCounts[s.charAt(i)]++;
            }

            int count = 0;
            for (int i = 0; i < 128; i++) {
                count += charCounts[i] % 2;
            }

            return count <= 1;
        }
    }
}
