package Amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * T: O(n log n) + O(n)
 * S: O(n)
 */
public class MergeIntervals {
    class Solution {
        public int[][] merge(int[][] intervals) {
            if (intervals.length <= 1) return intervals;
            //nick white
            Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

            List<int[]> result = new ArrayList<>();
            int[] currentInterval = intervals[0];
            result.add(currentInterval);

            for (int[] interval : intervals) {
                int currentBegin = currentInterval[0];
                int currentEnd = currentInterval[1];
                int nextBegin = interval[0];
                int nextEnd = interval[1];

                if (currentEnd >= nextBegin)
                    currentInterval[1] = Math.max(currentEnd, nextEnd);
                else {
                    currentInterval = interval;
                    result.add(currentInterval);
                }
            }
            return result.toArray(new int[0][]);
        }
    }
}
