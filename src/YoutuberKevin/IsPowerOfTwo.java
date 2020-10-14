package YoutuberKevin;

public class IsPowerOfTwo {
    class Solution {
        public boolean isPowerOfTwo(int n) {
            if (n == 0) return false;
            //x - 1 -> sets all the right most bits after first 1 bit to zero
            long x = (long) n;
            return (x & (x - 1)) == 0;
        }
    }
}
