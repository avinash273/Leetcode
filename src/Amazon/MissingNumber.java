package Amazon;

/**
 * T: O(n)
 * S: O(1)
 */
public class MissingNumber {
    class Solution {
        public int missingNumber(int[] nums) {
            int missing = nums.length;

            for (int i = 0; i < nums.length; i++)
                missing ^= nums[i] ^ i;
            return missing;
        }
    }
}
