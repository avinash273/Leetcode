package org.code.LeetcodeAmazon;

import java.util.HashMap;
import java.util.HashSet;

/**
 * T: O(n)
 * S: O(n)
 */
public class uniqueNumberOfOccurrences {
    class Solution {
        public boolean uniqueOccurrences(int[] arr) {
            HashMap<Integer, Integer> occurances = new HashMap<>();
            for (int each : arr)
                occurances.put(each, occurances.getOrDefault(each, 0) + 1);

            HashSet<Integer> set = new HashSet(occurances.values());

            return occurances.size() == set.size();
        }
    }
}
