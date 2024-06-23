package org.code.Amazon;

/**
 * T: O(log x)
 * S: O(1)
 * if ((newResult - tail) / 10 != result) return 0;
 * this line is to handle overflow of interget like 123..9 to 9..321
 */
public class ReverserInteger {
    class Solution {
        public int reverse(int x) {
            int result = 0;

            while (x != 0) {
                int tail = x % 10;
                int newResult = result * 10 + tail;

                if ((newResult - tail) / 10 != result) return 0;
                result = newResult;
                x = x / 10;
            }
            return result;
        }
    }
}
