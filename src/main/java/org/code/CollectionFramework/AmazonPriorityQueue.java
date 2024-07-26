package org.code.CollectionFramework;

import java.util.Arrays;
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

    public String sortString(String str){
        return str.chars()
                .collect(StringBuilder::new, (b, c) -> b.insert(0, (char) c), (b1, b2) -> b1.insert(0, b2))
                .toString();
    }

}

public static void main(String[] args) {

    AmazonPriorityQueue amazonPriorityQueue = new AmazonPriorityQueue();

    amazonPriorityQueue.sortString("String");
}
