package PracticeYoutuber.Arrays;

/**
 * T: O(n)
 * S: O(1)
 */
public class FirstUniqueChar387 {
    class Solution {
        public int firstUniqChar(String s) {
            int[] alphabet = new int[26];

            for (int i = 0; i < s.length(); i++) {
                alphabet[s.charAt(i) - 'a']++;
            }

            for (int i = 0; i < s.length(); i++) {
                if (alphabet[s.charAt(i) - 'a'] == 1)
                    return i;
            }
            return -1;
        }
    }
}
