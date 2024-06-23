package org.code.Leetcode;

import java.util.HashMap;

public class twoSum {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();

            for(int i=0; i<nums.length; i++){
                map.put(nums[i],i);
            }
            System.out.println(map);

            for (int i =0; i<nums.length; i++){
                int balance=0;
                balance = target - nums[i];
                if(map.containsKey(balance) && map.get(balance)!=i)
                    return new int[] {i, map.get(balance)};

            }

            return new int[] {0,0};
        }
    }
}
