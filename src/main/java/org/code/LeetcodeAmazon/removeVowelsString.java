package org.code.LeetcodeAmazon;

/**
 * T: O(n)
 * S: O(1)
 */

public class removeVowelsString {
    class Solution {
        public String removeVowels(String S) {
            int i = 0;
            int size = 0;
            for(char c: S.toCharArray()){
                if( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                    size++;
                }
            }
            char[] output = new char[S.length() - size];
            for(char c: S.toCharArray()){
                if( c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u'){
                    output[i] = c;
                    i++;
                }
            }
            return new String(output);
        }
    }
}
