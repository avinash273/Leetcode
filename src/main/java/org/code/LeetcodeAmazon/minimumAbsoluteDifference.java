package org.code.LeetcodeAmazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * T: O(n)
 * S: O(1)
 */
public class minimumAbsoluteDifference {
    class Solution {
        public List<List<Integer>> minimumAbsDifference(int[] arr) {
            Arrays.sort(arr);

            List<List<Integer>> result = new ArrayList();
            int minDiff = Integer.MAX_VALUE;

            for (int i = 1; i < arr.length; i++) {
                minDiff = Math.min(arr[i] - arr[i - 1], minDiff);
            }

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] - arr[i - 1] == minDiff) {
                    List<Integer> pair = new ArrayList();
                    pair.add(arr[i - 1]);
                    pair.add(arr[i]);
                    result.add(pair);
                }
            }
            return result;
        }
    }
}
