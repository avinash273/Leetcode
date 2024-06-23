package org.code.LeetcodeAmazon;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * T: O(n)
 * S: O(n)
 */

public class buddyString {
    class Solution {
        public boolean buddyStrings(String A, String B) {
            if(A == null || B == null || (A.length() != B.length()))
                return false;
            if(A.equals(B)){
                HashSet<Character> uniqueChars = new HashSet<>();
                for(char c: A.toCharArray())
                    uniqueChars.add(c);

                if(uniqueChars.size() < A.length())
                    return true;
                else
                    return false;
            }

            List<Integer> diff = new ArrayList<>();

            for(int i = 0 ; i < A.length(); i++){
                if(A.charAt(i) != B.charAt(i)){
                    diff.add(i);
                }
            }

            if(diff.size() == 2
                    && A.charAt(diff.get(0)) == B.charAt(diff.get(1))
                    && B.charAt(diff.get(0)) == A.charAt(diff.get(1)))
                return true;
            else
                return false;

        }
    }
}
