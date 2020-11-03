package Amazon;

import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * T: O(n log k)
 * S: O(n + k)
 */
public class TopKFrequentElements {
    class Solution {
        public int[] topKFrequent(int[] nums, int k) {
            if (k == nums.length) return nums;

            HashMap<Integer, Integer> map = new HashMap<>();
            for (int num : nums)
                map.put(num, map.getOrDefault(num, 0) + 1);

            PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));

            for (int num : map.keySet()) {
                minHeap.add(num);
                if (minHeap.size() > k)
                    minHeap.poll();
            }
            int[] result = new int[k];
            for (int i = k - 1; i >= 0; i--)
                result[i] = minHeap.poll();

            return result;
        }
    }

}
