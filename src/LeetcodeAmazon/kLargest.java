package LeetcodeAmazon;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * using priority queue
 * T: O(n)
 * S: O(n)
 */

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();

        for(int each : nums){
            minHeap.add(each);
            if(minHeap.size() > k)
                minHeap.remove();
        }
        return minHeap.remove();
    }
}

/**
 * Bad Solution, not interview worth
 * T: O(n log n)
 * S: O(1)
 */
public class kLargest {
    class Solution {
        public int findKthLargest(int[] nums, int k) {
            Arrays.sort(nums);
            return nums[nums.length - k];
        }
    }
}
