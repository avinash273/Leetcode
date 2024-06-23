package org.code.LeetcodeAmazon;

import java.util.List;

/**
 * T: O(n)
 * S: O(n)
 */
public class minimumTimeDifference {
    class Solution {
        public int findMinDifference(List<String> timePoints) {
            boolean[] timeSeen = new boolean[24 * 60];

            for (String time : timePoints) {
                String[] timeSplit = time.split(":");
                int hour = Integer.parseInt(timeSplit[0]);
                int minute = Integer.parseInt(timeSplit[1]);
                if (timeSeen[(hour * 60) + minute]) return 0;
                timeSeen[(hour * 60) + minute] = true;
            }
            Integer firstTimeSeen = null;
            Integer prevTimeSeen = null;
            Integer minDiff = Integer.MAX_VALUE;

            for (int i = 0; i < 1440; i++) {
                if (timeSeen[i]) {
                    if (firstTimeSeen == null) {
                        firstTimeSeen = i;
                        prevTimeSeen = i;
                    } else {
                        minDiff = Math.min(minDiff, Math.min(i - prevTimeSeen, 1440 - i + prevTimeSeen));
                        prevTimeSeen = i;
                    }
                }
            }
            minDiff = Math.min(minDiff, Math.min(prevTimeSeen - firstTimeSeen, 1440 - prevTimeSeen + firstTimeSeen));
            return minDiff;
        }
    }
}
