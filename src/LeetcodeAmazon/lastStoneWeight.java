package LeetcodeAmazon;

import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/last-stone-weight/
 * T: O(n log n) as its a priority Queue
 * S: O(n)
 */

public class lastStoneWeight {
    static class Solution {
        public int lastStoneWeight(int[] stones) {
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b-a);

            for(int stone: stones)
                maxHeap.add(stone);

            while(maxHeap.size() > 1){
                int stoneOne = maxHeap.remove();
                int stoneTwo = maxHeap.remove();

                if(stoneOne != stoneTwo){
                    maxHeap.add(stoneOne - stoneTwo);
                }
            }
            return maxHeap.isEmpty() ? 0 : maxHeap.remove();
        }
    }
}
