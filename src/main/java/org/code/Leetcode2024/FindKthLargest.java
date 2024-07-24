package org.code.Leetcode2024;

import java.util.PriorityQueue;

public class FindKthLargest {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for(int num : nums){
            heap.add(num);

            if(heap.size() > k){
                heap.remove();
            }
        }
        return heap.peek() != null ? heap.peek() : -1;
    }
}
