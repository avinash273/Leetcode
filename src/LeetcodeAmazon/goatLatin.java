package LeetcodeAmazon;

import java.util.HashSet;

/***
 * T: O(n^2)
 * S: O(n)
 */

public class goatLatin {
    class Solution {
        public String toGoatLatin(String S) {
            HashSet<Character> vowels = new HashSet<>();

            for (char c : "aeiouAEIOU".toCharArray())
                vowels.add(c);

            String result = "";
            int index = 1;
            for (String word : S.split("\\s")) {
                if (index > 1)
                    result += " ";
                char firstLetter = word.charAt(0);
                if (vowels.contains(firstLetter)) {
                    result += word + "ma";
                } else {
                    result += word.substring(1) + firstLetter + "ma";
                }

                for (int j = 0; j < index; j++)
                    result += "a";
                index++;
            }

            return result;
        }
    }
}
