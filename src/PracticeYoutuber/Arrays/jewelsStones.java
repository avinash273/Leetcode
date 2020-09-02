package PracticeYoutuber.Arrays;

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
}
