package Top75;

import java.util.Arrays;

/**
 * T: O(n)
 * S: O(n)
 */
public class houseRobberII {
    class Solution {
        public int rob(int[] nums) {
            if(nums == null || nums.length == 0) return 0;
            if(nums.length == 1) return nums[0];
            if(nums.length == 2) return Math.max(nums[0], nums[1]);

            int[] dp = new int[nums.length];
            dp[0] = nums[0];
            dp[1] = Math.max(nums[0], nums[1]);

            for(int i = 2; i < nums.length - 1; i++){
                dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
            }

            int max = dp[nums.length - 2];
            Arrays.fill(dp, 0);
            dp[0] = nums[1];
            dp[1] = Math.max(nums[1], nums[2]);

            for(int i = 2; i < nums.length - 1; i++){
                dp[i] = Math.max(nums[i + 1] + dp[i - 2], dp[i - 1]);
            }

            return Math.max(max, dp[nums.length - 2]);
        }
    }
}
