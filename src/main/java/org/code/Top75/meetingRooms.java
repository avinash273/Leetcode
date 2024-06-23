package org.code.Top75;

import java.util.Arrays;

/**
 * T: O(n log n)
 * S: O(n)
 */
public class meetingRooms {
    class Solution {
        public boolean canAttendMeetings(int[][] intervals) {
            if (intervals == null) return false;

            Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

            for (int i = 0; i < intervals.length - 1; i++) {
                if (intervals[i][1] > intervals[i + 1][0])
                    return false;
            }
            return true;
        }
    }

}
