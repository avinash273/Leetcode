package org.code.LeetcodeAmazon;

import java.util.List;

/**
 * T: O(m*n)
 * S; O(m*n)
 */

public class maxLengthConcatString {
    class Solution {
        public int maxLength(List<String> arr) {
            int[] result = new int[1];
            maxUnique(arr, 0, "", result);

            return result[0];
        }

        public void maxUnique(List<String> arr, int index, String current, int[] result) {
            if (index == arr.size() && uniqueCharCount(current) > result[0])
                result[0] = current.length();

            if (index == arr.size())
                return;

            maxUnique(arr, index + 1, current, result);
            maxUnique(arr, index + 1, current + arr.get(index), result);
        }

        public int uniqueCharCount(String S) {
            int[] counts = new int[26];
            for (char c : S.toCharArray()) {
                if (counts[c - 'a']++ > 0)
                    return -1;
            }
            return S.length();
        }
    }
}
