package Amazon;

import java.util.HashMap;

/**
 * T: O(n)
 * S: O(n)
 */
public class TwoSum {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> map = new HashMap<>();

            int complement = 0;
            int result[] = new int[2];

            for (int i = 0; i < nums.length; i++) {
                complement = target - nums[i];
                if (map.containsKey(complement)) {
                    return new int[]{map.get(complement), i};
                } else {
                    map.put(nums[i], i);
                }
            }
            return result;
        }
    }
}
