package LeetcodeAmazon;

import java.util.*;

/**
 * T: O(n)
 * S: O(1)
 */
public class mergeIntervals {
    class Solution {
        public int[][] merge(int[][] intervals) {
            if (intervals.length <= 1) {
                return intervals;
            }

            Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));
            List<int[]> outputArr = new ArrayList();
            int[] currentInterval = intervals[0];
            outputArr.add(currentInterval);

            for (int[] interval : intervals) {
                int currentBegin = currentInterval[0];
                int currentEnd = currentInterval[1];
                int nextBegin = interval[0];
                int nextEnd = interval[1];

                if (currentEnd >= nextBegin) {
                    currentInterval[1] = Math.max(currentEnd, nextEnd);
                } else {
                    currentInterval = interval;
                    outputArr.add(currentInterval);
                }
            }

            return outputArr.toArray(new int[outputArr.size()][]);
        }
    }
}
