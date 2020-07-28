package Top75;

/**
 * T: O(n)
 * S: O(1)
 */
public class missingNumber {
    class Solution {
        public int missingNumber(int[] nums) {
            int missing = nums.length;

            for (int i = 0; i < nums.length; i++) {
                missing = missing ^ i ^ nums[i];
            }
            return missing;
        }
    }
}
