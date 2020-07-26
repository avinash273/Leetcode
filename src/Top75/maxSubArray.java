package Top75;

/**
 *
 */
public class maxSubArray {
    class Solution {
        public int maxSubArray(int[] nums) {
            int n = nums.length;
            if (n == 0 || nums == null) return 0;

            int currSum = nums[0];
            int maxSum = nums[0];

            for (int i = 1; i < n; i++) {
                currSum = Math.max(nums[i], currSum + nums[i]);
                maxSum = Math.max(currSum, maxSum);
            }
            return maxSum;
        }
    }
}
