package org.code.Amazon;

import java.util.Arrays;

/**
 * T: O 2(n log n)
 * S: O(2n)
 */
public class MeetingRoomsII {
    class Solution {
        public int minMeetingRooms(int[][] intervals) {
            int n = intervals.length;

            int start[] = new int[n];
            int end[] = new int[n];

            for (int i = 0; i < n; i++) {
                start[i] = intervals[i][0];
                end[i] = intervals[i][1];
            }

            Arrays.sort(start);
            Arrays.sort(end);

            int startIdx = 0, endIdx = 0, rooms = 0;

            while (startIdx < n) {
                if (start[startIdx] < end[endIdx])
                    rooms++;
                else
                    endIdx++;
                startIdx++;
            }
            return rooms;
        }
    }
}
