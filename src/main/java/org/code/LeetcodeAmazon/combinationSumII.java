package org.code.LeetcodeAmazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * T: O(2^n)
 * S: O(n)
 * very tough to understand
 * https://leetcode.com/problems/combination-sum-ii/submissions/
 */

public class combinationSumII {
    class Solution {
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            List<List<Integer>> result = new ArrayList<>();
            Arrays.sort(candidates);
            findCombinations(candidates, 0, target, new ArrayList<>(), result);
            return result;
        }

        void findCombinations(int[] candidates, int index, int target, List<Integer> current, List<List<Integer>> result){
            if(target == 0){
                result.add(new ArrayList<Integer>(current));
                return;
            }

            if(target < 0)
                return;

            for(int i = index; i < candidates.length; i++){
                if(i == index || candidates[i] != candidates[i - 1]){
                    current.add(candidates[i]);
                    findCombinations(candidates, i + 1, target - candidates[i], current, result);
                    current.remove(current.size() - 1);
                }
            }
        }
    }
}
