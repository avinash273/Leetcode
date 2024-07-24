package org.code.CollectionFramework;

import java.util.HashSet;
import java.util.PriorityQueue;

public class AmazonPriorityQueue {

    int getKLargest(int[] nums, int k){

        if(nums.length == 0) return 0;

        PriorityQueue<Integer> heap = new PriorityQueue<>();

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }


        for(int num : set){
            heap.add(num);
            if(heap.size() > k){
                heap.remove();
            }
        }

        return heap.peek();

    }

    public static void main(String[] args) {

    }
}
