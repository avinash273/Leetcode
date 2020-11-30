package Top75;

import java.util.Arrays;

/**
 * T: O(n log n)
 * S: (1)
 */
public class nonOverlappingIntervals {
    class Solution {
        public int eraseOverlapIntervals(int[][] intervals) {
            if (intervals.length == 0) return 0;

            Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

            int res = 0;
            int end = intervals[0][1];

            for (int i = 1; i < intervals.length; i++) {
                if (intervals[i][0] >= end)
                    end = intervals[i][1];
                else {
                    res++;
                    end = Math.min(intervals[i][1], end);
                }
            }
            return res;
        }
    }
}
