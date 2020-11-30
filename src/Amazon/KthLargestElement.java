package Amazon;

import java.util.PriorityQueue;

/**
 * T: O(n log k)
 * S: O(k)
 */
class KthLargestElement {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for(int num : nums){
            minHeap.add(num);
            if(minHeap.size() > k)
                minHeap.poll();
        }
        return minHeap.peek();
    }
}