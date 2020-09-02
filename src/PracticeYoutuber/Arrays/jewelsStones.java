package PracticeYoutuber.Arrays;

import java.util.HashSet;

/**
 * T: O(s+j)
 * S: O(1)
 */
public class jewelsStones {
    class Solution {
        public int numJewelsInStones(String J, String S) {
            int[] jewelMap = new int[128];

            for (char jewel : J.toCharArray())
                jewelMap[jewel]++;

            int result = 0;

            for (char each : S.toCharArray()) {
                if (jewelMap[each] > 0)
                    result++;
            }
            return result;
        }
    }

    /**
     * T: O(s+j)
     * S: O(j)
     */
    class Solution2 {
        public int numJewelsInStones(String J, String S) {
            HashSet<Character> jewels = new HashSet<>();

            for (char jewel : J.toCharArray())
                jewels.add(jewel);

            int result = 0;

            for (char each : S.toCharArray()) {
                if (jewels.contains(each))
                    result++;
            }
            return result;
        }
    }
}
