package Amazon;

import java.util.PriorityQueue;

/**
 * T: O(n log k)
 * S: O(k)

 */
public class KClosestPointsToOrigin {
    class Solution {
        public int[][] kClosest(int[][] points, int K) {
            PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> (b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1]));

            for (int[] point : points) {
                maxHeap.add(point);
                if (maxHeap.size() > K)
                    maxHeap.poll();
            }

            int result[][] = new int[K][2];
            while (K > 0)
                result[--K] = maxHeap.poll();
            return result;
        }
    }


}
