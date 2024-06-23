package org.code.LeetcodeAmazon;

import java.util.PriorityQueue;

/**
 * T: O(n log n)
 * S: O(n)
 * very Good question, asked by amazon
 * Used priority queue
 */

public class connectSticks {
    class Solution {
        public int connectSticks(int[] sticks) {
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();

            for (int stick : sticks)
                minHeap.add(stick);

            int minCost = 0;

            while (minHeap.size() > 1) {
                int x = minHeap.remove();
                int y = minHeap.remove();
                minCost = minCost + x + y;
                minHeap.add(x + y);
            }
            return minCost;
        }
    }
}
