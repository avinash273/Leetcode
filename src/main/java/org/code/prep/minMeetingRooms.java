package org.code.prep;

import java.util.Arrays;
import java.util.PriorityQueue;

public class minMeetingRooms {
    class Solution {
        public int minMeetingRooms(int[][] intervals) {
            if (intervals.length <= 0) return 0;
            int minRooms = 0;

            Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

            PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> a[1] - b[1]);
            for (int[] interval : intervals) {
                while (!queue.isEmpty() && interval[0] >= queue.peek()[1]) {
                    queue.poll();
                }

                queue.offer(interval);
                minRooms = Math.max(minRooms, queue.size());
            }

            return minRooms;
        }
    }
}
