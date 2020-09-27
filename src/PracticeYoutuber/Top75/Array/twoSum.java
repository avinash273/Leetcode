package PracticeYoutuber.Top75.Array;

import java.util.HashMap;

/**
 * T: O(n)
 * S: O(n)
 * still need to do more
 */
public class twoSum {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                if (!map.containsKey(target - nums[i])) {
                    map.put(nums[i], i);
                } else {
                    return new int[]{i, map.get(target - nums[i])};
                }
            }
            return new int[]{0, 0};
        }
    }
}
