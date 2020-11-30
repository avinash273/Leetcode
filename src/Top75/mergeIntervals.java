package Top75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * T: O(n log n)
 * S: O(1)
 */
public class mergeIntervals {
    class Solution {
        public int[][] merge(int[][] intervals) {
            if (intervals.length <= 1) return intervals;

            Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

            List<int[]> result = new ArrayList<>();
            int[] newInterval = intervals[0];
            result.add(newInterval);
            System.out.println();

            for (int[] interval : intervals) {
                // Overlapping intervals, move the end if needed
                if (interval[0] <= newInterval[1])
                    newInterval[1] = Math.max(newInterval[1], interval[1]);

                    // Disjoint intervals, add the new interval to the list
                else {
                    newInterval = interval;
                    result.add(newInterval);
                }
            }
            return result.toArray(new int[0][]);
        }
    }

}
