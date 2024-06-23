package org.code.LeetcodeAmazon;

import java.util.PriorityQueue;

/**
 * T: O(n)
 * S: O(k)
 * Link:
 * https://leetcode.com/problems/k-closest-points-to-origin/solution/
 */

public class kClosestToOrigin {
    class Solution {
        public int[][] kClosest(int[][] points, int K) {
            PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> (b[0]*b[0] + b[1]*b[1] - (a[0]*a[0] + a[1]*a[1])));

            for(int[] point: points){
                maxHeap.add(point);
                if(maxHeap.size() > K)
                    maxHeap.remove();
            }

            int[][] result = new int[K][2];

            while(K-- > 0){
                result[K] = maxHeap.remove();
            }
            return result;
        }
    }
}
