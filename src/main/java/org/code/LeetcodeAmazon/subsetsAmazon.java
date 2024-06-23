package org.code.LeetcodeAmazon;

import java.util.ArrayList;
import java.util.List;

/**
 * very important, method.
 * Need to learn thoroughly
 * T: O(2^n) every single me are making a choice
 * S: O(n)
 */
public class subsetsAmazon {
    class Solution {
        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> subsets = new ArrayList<>();
            generateSubsets(0, nums, new ArrayList<Integer>(), subsets);
            return subsets;
        }

        void generateSubsets(int index, int[] nums, List<Integer> current, List<List<Integer>> subsets) {
            subsets.add(new ArrayList<>(current));

            for (int i = index; i < nums.length; i++) {
                current.add(nums[i]);
                generateSubsets(i + 1, nums, current, subsets);
                current.remove(current.size() - 1);
            }
        }
    }
}
