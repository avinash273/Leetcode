package org.code.LeetcodeAmazon;

import java.util.ArrayList;
import java.util.List;

/**
 * very important amazon question, didn't understand
 * T: O(2n)
 * S: O(1) ~ O(26)
 */

public class partitionLabels {
    class Solution {
        public List<Integer> partitionLabels(String S) {
            List<Integer> partitionLen = new ArrayList<>();
            int[] lastIndexes = new int[26];

            for (int i = 0; i < S.length(); i++)
                lastIndexes[S.charAt(i) - 'a'] = i;

            int i = 0;
            while (i < S.length()) {
                int end = lastIndexes[S.charAt(i) - 'a'];
                int j = i;

                while (j != end)
                    end = Math.max(end, lastIndexes[S.charAt(j++) - 'a']);

                partitionLen.add(j - i + 1);
                i = j + 1;
            }
            return partitionLen;
        }
    }
}
