package org.code.Top75;

/**
 * T: O(n)
 * S: O(1)
 */
public class countingBits {
    class Solution {
        public int[] countBits(int num) {
            int[] result = new int[num + 1];
            for (int i = 0; i <= num; i++) {
                result[i] = getBitCount(i);
            }
            return result;
        }

        int getBitCount(int n) {

            int sum = 0;
            while (n != 0) {
                sum++;
                n = n & (n - 1);
            }
            return sum;
        }
    }
}
