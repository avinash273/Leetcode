package LeetcodeAmazon;

public class distanceBetweenBusStops {
    class Solution {
        public int distanceBetweenBusStops(int[] distance, int start, int destination) {
            if (start == destination)
                return 0;

            int clockDistance = 0;
            int antiClockDistance = 0;

            int begin = Math.min(start, destination);
            int end = Math.max(start, destination);

            //regular distance
            while (begin < end) {
                clockDistance += distance[begin];
            }

            //round distance
            while (end != begin) {
                antiClockDistance += distance[end];
                if (end == distance.length)
                    end = 0;
            }
            return Math.min(antiClockDistance, clockDistance);
        }
    }
}
