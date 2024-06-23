package org.code.Top75;

/**
 * T: O(1) ~ O(32bits)
 * S: O(1)
 */
public class hammingDistance {
    public class Solution {
        public int hammingWeight(int n) {
            int sum = 0;
            while (n != 0) {
                sum++;
                n = n & (n - 1);
            }
            return sum;
        }
    }
}
