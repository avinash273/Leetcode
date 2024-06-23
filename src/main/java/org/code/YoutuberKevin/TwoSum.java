package org.code.YoutuberKevin;

import java.util.HashMap;

/**
 * T: O(n)
 * S: O(n)
 */
public class TwoSum {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            if (nums.length == 0) return new int[2];

            HashMap<Integer, Integer> map = new HashMap<>();
            int result[] = new int[2];

            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(target - nums[i])) {
                    result[0] = i;
                    result[1] = map.get(target - nums[i]);
                } else {
                    map.put(nums[i], i);
                }
            }
            return result;
        }
    }


}
