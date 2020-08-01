package Top75;

import java.util.ArrayList;
import java.util.List;

public class insertInterval {
    class Solution {
        public int[][] insert(int[][] intervals, int[] newInterval) {
            List<int[]> ans = new ArrayList<>();
            int[] toAdd = newInterval;

            for (int i = 0; i < intervals.length; i++) {
                //1. no overlap and start appears before current interval, so add to result
                if (intervals[i][0] > toAdd[1]) {
                    ans.add(toAdd);
                    toAdd = intervals[i];
                }

                //2. Has overlap, update the toAdd to the merged interval
                else if (intervals[i][1] >= toAdd[0])
                    toAdd = new int[]{Math.min(intervals[i][0], toAdd[0]),
                            Math.max(intervals[i][1], toAdd[1])};

                    //3. no overlap and toAdd appears after current interval, add current interval to result
                else
                    ans.add(intervals[i]);
            }

            ans.add(toAdd);
            return ans.toArray(new int[0][0]);
        }
    }
}
