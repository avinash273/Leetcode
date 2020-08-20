package PracticeYoutuber.Bitwise;

/**
 * T: O(1)
 * S: O(1)
 */
public class PowerOfTwo231 {
    class Solution {
        public boolean isPowerOfTwo(int n) {
            if (n == 0) return false;
            long x = (long) n;
            return (x & (-x)) == x;
        }
    }
}
