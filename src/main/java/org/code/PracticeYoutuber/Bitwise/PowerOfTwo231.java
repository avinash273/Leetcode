package org.code.PracticeYoutuber.Bitwise;

/**
 * T: O(1)
 * S: O(1)
 */

/**
 * Idea in short, power of two only has one bit as 1 eg: 8 -> 0000 1000
 * so, -x = ~x + 1
 * when you do x & (-x) if it more than one 1 it will give u different result
 */
public class PowerOfTwo231 {
    class Solution {
        public boolean isPowerOfTwo(int n) {
            if (n == 0) return false;
            long x = (long) n;
            return (x & (-x)) == x;
        }
    }

    class Solution2 {
        public boolean isPowerOfTwo(int n) {
            //idea is power of two has 1 followed by zeros like 1 - 0000 0001 8 -> 0000 1000
            if(n == 0) return false;
            long x = (long) n;
            return (x & (-x)) == x;
        }
    }
}
