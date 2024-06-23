package org.code.PracticeYoutuber.Arrays;

/**
 * T: O(log10 n)
 * S: (1)
 */
public class ReverseInteger {
    class Solution {
        public int reverse(int num) {
            boolean negative = false;
            if (num < 0) {
                negative = true;
                num = num * -1;
            }

            long reversed = 0;

            while (num > 0) {
                reversed = (reversed * 10) + (num % 10);
                num = num / 10;
            }

            if (reversed > Integer.MAX_VALUE) return 0;

            return negative ? (int) (-1 * reversed) : (int) reversed;
        }
    }
}
