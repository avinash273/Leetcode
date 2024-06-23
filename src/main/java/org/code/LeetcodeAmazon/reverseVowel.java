package org.code.LeetcodeAmazon;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/reverse-vowels-of-a-string/submissions/
 * T: O(n)
 * S: O(n)
 */

public class reverseVowel {
    class Solution {
        public String reverseVowels(String s) {

            int left = 0;
            int right = s.length() - 1;
            Set<Character> set = new HashSet<Character>();
            set.add('a');
            set.add('e');
            set.add('i');
            set.add('o');
            set.add('u');
            set.add('A');
            set.add('E');
            set.add('I');
            set.add('O');
            set.add('U');

            char[] characters = s.toCharArray();
            int i = 0;
            int j = s.length() - 1;

            while (i < j) {
                while (i < j && !set.contains(characters[i])) {
                    i++;
                }

                while (i < j && !set.contains(characters[j])) {
                    j--;
                }
                char temp = characters[i];
                characters[i++] = characters[j];
                characters[j--] = temp;

            }
            return new String(characters);
        }
    }
}
