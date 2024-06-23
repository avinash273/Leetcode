package org.code.PracticeYoutuber.Math;

/**
 * T: O(log n)
 * S: O(1)
 * Better bitwise solution is in bitwise package with T: O(1)
 */
public class PowerOfTwo231 {
    class Solution {
        public boolean isPowerOfTwo(int n) {
            if (n <= 0) return false;
            while (n > 1) {
                if (n % 2 != 0) return false;
                n = n / 2;
            }
            return true;
        }
    }
}
