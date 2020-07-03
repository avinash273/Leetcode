package LeetcodeAmazon;

public class maximumProductSubarrayContinous {
    class Solution {
        public int maxProduct(int[] nums) {
            if (nums == null || nums.length == 0)
                return -1;
            int i = 0;
            int currentMax = nums[i];
            int currentMin = nums[i];
            int finalMax = nums[i];

            for (i = 1; i < nums.length; i++) {
                int temp = currentMax;
                currentMax = Math.max(Math.max(currentMax * nums[i], currentMin * nums[i]), nums[i]);

                currentMin = Math.min(Math.min(temp * nums[i], currentMin * nums[i]), nums[i]);

                if (currentMax > finalMax)
                    finalMax = currentMax;
            }
            return finalMax;
        }
    }
}
