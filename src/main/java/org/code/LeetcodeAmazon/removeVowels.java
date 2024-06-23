package org.code.LeetcodeAmazon;

import java.util.*;

/**
 * T: O(n)
 * S; O(1)
 */
public class removeVowels {
    class Solution {
        public String removeVowels(String S) {
            StringBuilder sb = new StringBuilder();
            Set<Character> vowels = new HashSet<Character>();
            vowels.add('a');
            vowels.add('e');
            vowels.add('i');
            vowels.add('o');
            vowels.add('u');

            for(char each: S.toCharArray()){
                if(!vowels.contains(each)){
                    sb.append(each);
                }
            }
            return sb.toString();
        }
    }


    class Solution2 {
        public String removeVowels(String S) {
            return S.replaceAll("[aeiou]","");
        }
    }
}
