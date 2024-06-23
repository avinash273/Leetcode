package org.code.LeetcodeAmazon;

import java.util.*;

/**
 * T: O(n log n)
 * S: O(n)
 */

public class LargestValueFromLabels {
    class Solution {
        public int largestValsFromLabels(int[] values, int[] labels, int num_wanted, int use_limit) {
            List<Item> items = new ArrayList<>();
            for (int i = 0; i < labels.length; i++)
                items.add(new Item(values[i], labels[i]));

            PriorityQueue<Item> maxHeap = new PriorityQueue<>((Item a, Item b) -> b.value - a.value);
            maxHeap.addAll(items);

            Map<Integer, Integer> counts = new HashMap<>();
            int value = 0;
            while (!maxHeap.isEmpty() && num_wanted > 0) {
                Item current = maxHeap.remove();
                counts.put(current.label, counts.getOrDefault(current.label, 0) + 1);

                if (counts.get(current.label) <= use_limit) {
                    value += current.value;
                    num_wanted--;
                }
            }
            return value;

        }

        class Item {
            int value;
            int label;

            public Item(int value, int label) {
                this.value = value;
                this.label = label;
            }
        }
    }
}
