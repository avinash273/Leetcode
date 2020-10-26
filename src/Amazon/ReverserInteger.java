package Amazon;

/**
 * T: O(log x)
 * S: O(1)
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
