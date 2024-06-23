package org.code.PracticeYoutuber.Arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * T: O(n)
 * S: O(n)
 */
public class ContainsDuplicateII_219 {
    class Solution {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            Map<Integer, Integer> map = new HashMap<>();

            int index = 0;
            for (int each : nums) {
                if (map.containsKey(each)) {
                    if ((index - map.get(each)) <= k) return true;
                }
                map.put(each, index);
                index++;
            }
            return false;
        }
    }


}
