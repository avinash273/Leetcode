package LeetcodeAmazon;

/**
 * T: O(n)
 * S: O(1)
 */
public class robotOrigin {
    class Solution {
        public boolean judgeCircle(String moves) {

            if (moves == null || moves.length() == 0)
                return true;
            int up = 0;
            int left = 0;

            for (char move : moves.toCharArray()) {
                if (move == 'U')
                    up++;
                else if (move == 'L')
                    left++;
                else if (move == 'D')
                    up--;
                else if (move == 'R')
                    left--;
            }

            return up == 0 && left == 0;
        }
    }
}
