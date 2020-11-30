package Top75;

/**
 * T: O(n)
 * S: O(1)
 */
public class productExceptSelf {
    class Solution {
        public int[] productExceptSelf(int[] nums) {
            int len = nums.length;
            int[] result = new int[len];

            int left = 1;
            for (int i = 0; i < len; i++) {
                if (i > 0)
                    left = left * nums[i - 1];
                result[i] = left;
            }

            int right = 1;
            for (int i = len - 1; i >= 0; i--) {
                if (i < len - 1)
                    right = right * nums[i + 1];
                result[i] *= right;
            }
            return result;
        }
    }
}
