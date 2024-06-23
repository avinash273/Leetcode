package org.code.Top75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * T: O(n^2)
 * S: O(1)
 */
public class threeSum {
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();

            Arrays.sort(nums);
            for (int i = 0; i < nums.length - 2; i++) {
                if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                    int left = i + 1;
                    int right = nums.length - 1;
                    int sum = 0 - nums[i];

                    while (left < right) {
                        if (nums[left] + nums[right] == sum) {
                            result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                            while (left < right && nums[left] == nums[left + 1]) left++;
                            while (left < right && nums[right] == nums[right - 1]) right--;
                            left++;
                            right--;
                        } else if (nums[left] + nums[right] < sum) left++;
                        else right--;
                    }
                }
            }
            return result;
        }
    }
}
