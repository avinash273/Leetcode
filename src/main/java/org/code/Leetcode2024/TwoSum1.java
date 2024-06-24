package org.code.Leetcode2024;

import java.util.HashMap;

public class TwoSum1 {
        public int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length == 0)return new int[]{0, 0};

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(target - nums[i])){
                map.put(nums[i], i);
            }
            else{
                return new int[]{i, map.get(target - nums[i])};
            }
        }
        return new int[]{0, 0};
    }
}
