package PracticeYoutuber.Arrays;

/**
 * T: O(n)
 * S: O(1)
 */
public class RobotReturnToOrigin {
    class Solution {
        public boolean judgeCircle(String moves) {
            int up = 0;
            int left = 0;

            for (char each : moves.toCharArray()) {
                if (each == 'U')
                    up++;
                else if (each == 'D')
                    up--;
                else if (each == 'L')
                    left++;
                else
                    left--;
            }
            return (left == 0 && up == 0);
        }
    }
}
