package LeetcodeAmazon;

import java.util.HashMap;

/**
 * T: O(n)
 * S: O(n)
 */
public class wordPattern {
    class Solution {
        public boolean wordPattern(String pattern, String str) {
            String[] words = str.split(" ");
            if (words.length != pattern.length())
                return false;

            HashMap<Character, String> map = new HashMap<>();

            for (int i = 0; i < pattern.length(); i++) {
                char currentChar = pattern.charAt(i);
                if (map.containsKey(currentChar)) {
                    if (!map.get(currentChar).equals(words[i])) {
                        return false;
                    }
                } else {
                    if (map.containsValue(words[i]))
                        return false;
                    map.put(currentChar, words[i]);
                }
            }
            return true;
        }
    }
}
