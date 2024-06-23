package org.code.YoutuberKevin;

import java.util.HashSet;
import java.util.Set;

/**
 * T: O(n)
 * S: O(n)
 *
 */
public class ContainsDuplicate {
    class Solution {
        public boolean containsDuplicate(int[] nums) {
            Set<Integer> set = new HashSet<>();

            for (int num : nums) {
                if (set.contains(num))
                    return true;
                else
                    set.add(num);
            }
            return false;
        }
    }
}
