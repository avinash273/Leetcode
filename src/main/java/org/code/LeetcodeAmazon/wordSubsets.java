package org.code.LeetcodeAmazon;

import java.util.ArrayList;
import java.util.List;

/**
 * T: O(A + B)
 * S: O(A.length + B.length)
 */

public class wordSubsets {
    class Solution {
        public List<String> wordSubsets(String[] A, String[] B) {
            List<String> result = new ArrayList<>();
            int[] maxBFreq = new int[26];
            for (int i = 0; i < B.length; i++) {
                int[] charFreq = getCharFreq(B[i]);


                for (int j = 0; j < 26; j++) {
                    maxBFreq[j] = Math.max(charFreq[j], maxBFreq[j]);
                }
            }

            for (int i = 0; i < A.length; i++) {
                int[] charFreq = getCharFreq(A[i]);

                boolean valid = true;
                for (int j = 0; j < 26; j++) {
                    if (charFreq[j] < maxBFreq[j]) {
                        valid = false;
                        break;
                    }
                }

                if (valid)
                    result.add(A[i]);
            }

            return result;

        }

        public int[] getCharFreq(String S) {
            int[] charFreq = new int[26];

            for (char c : S.toCharArray()) {
                charFreq[c - 'a']++;
            }
            return charFreq;
        }
    }
}
