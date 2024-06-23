package org.code.LeetcodeAmazon;

import java.util.HashMap;

/**
 * T; O(n)
 * S: O(n)
 */

public class fruitIntoBasket {
    class Solution {
        public int totalFruit(int[] tree) {
            if (tree == null || tree.length == 0) {
                return 0;
            }

            int max = 1;
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

            int i = 0;
            int j = 0;

            while (j < tree.length) {
                if (map.size() <= 2)
                    map.put(tree[j], j++);

                if (map.size() > 2) {
                    int min = tree.length - 1;
                    for (int value : map.values()) {
                        min = Math.min(min, value);
                    }

                    i = min + 1;
                    map.remove(tree[min]);
                }
                max = Math.max(max, j - i);
            }
            return max;
        }
    }
}
