package Amazon;

/**
 * T: O(n)
 * S: O(1)
 */
public class ProductOfArrayExceptSelf {
    class Solution {
        //https://www.youtube.com/watch?v=tSRFtR3pv74&t=628s&ab_channel=NickWhite
        public int[] productExceptSelf(int[] nums) {
            int n = nums.length;
            int[] output = new int[n];

            output[0] = 1;

            for (int i = 1; i < n; i++) {
                output[i] = output[i - 1] * nums[i - 1];
            }

            int lastProd = 1;
            for (int i = n - 1; i >= 0; i--) {
                output[i] = output[i] * lastProd;
                lastProd *= nums[i];
            }

            return output;
        }
    }
}
