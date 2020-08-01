package Top75;

import java.util.Arrays;

/**
 * T: O(n log n)
 * S: O(2n) ~ O(n)
 */
public class minMeetingRooms {
    class Solution {
        public int minMeetingRooms(int[][] intervals) {

            int n = intervals.length;
            int[] start = new int[n];
            int[] end = new int[n];

            for (int i = 0; i < n; i++) {
                start[i] = intervals[i][0];
                end[i] = intervals[i][1];
            }

            Arrays.sort(start);
            Arrays.sort(end);

            int startInd = 0, endInd = 0, rooms = 0;

            while (startInd < n) {

                if (start[startInd] < end[endInd])
                    rooms++;
                else
                    endInd++;
                startInd++;
            }
            return rooms;
        }
    }
}
