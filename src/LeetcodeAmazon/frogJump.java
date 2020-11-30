package LeetcodeAmazon;

import java.util.*;

/**
 * Time and space not know
 * Didnt understand completely
 * Will, get back to this problem, soon
 * Link
 * https://leetcode.com/problems/frog-jump/submissions/
 */

public class frogJump {
    class Solution {
        public boolean canCross(int[] stones) {
            for (int i = 3; i < stones.length; i++) {
                if (stones[i] > stones[i - 1] * 2)
                    return false;
            }

            HashSet<Integer> stonePositions = new HashSet<>();
            for (int stone : stones) {
                stonePositions.add(stone);
            }

            int lastStone = stones[stones.length - 1];
            Stack<Integer> positions = new Stack<>();
            Stack<Integer> jumps = new Stack<>();
            positions.add(0);
            jumps.add(0);
            while (!positions.isEmpty()) {
                int position = positions.pop();
                int jumpDistance = jumps.pop();
                for (int i = jumpDistance - 1; i <= jumpDistance + 1; i++) {
                    if (i <= 0)
                        continue;

                    int nextPosition = position + i;
                    if (nextPosition == lastStone)
                        return true;
                    else if (stonePositions.contains(nextPosition)) {
                        positions.add(nextPosition);
                        jumps.add(i);
                    }
                }
            }
            return false;
        }
    }
}
