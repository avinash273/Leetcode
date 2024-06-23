package org.code.Amazon;

import java.util.Arrays;

/**
 * T: O(n log n + n^2)
 * S: O(n) ~ O(1)
 */
public class ThreeSumClosest {
    class Solution {
        public int threeSumClosest(int[] nums, int target) {
            int n = nums.length;
            int result = nums[0] + nums[1] + nums[n - 1];
            Arrays.sort(nums);


            for (int i = 0; i < n - 2; i++) {
                int left = i + 1;
                int right = n - 1;

                while (left < right) {
                    int currentSum = nums[i] + nums[left] + nums[right];
                    if (currentSum < target)
                        left++;
                    else
                        right--;
                    if (Math.abs(currentSum - target) < Math.abs(result - target))
                        result = currentSum;
                }
            }
            return result;
        }
    }


}
