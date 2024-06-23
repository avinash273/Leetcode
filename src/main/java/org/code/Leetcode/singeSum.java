package org.code.Leetcode;

import java.util.HashSet;

class singleSum {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        int totalSum = 0;
        int twiceSum = 0;
        for(int i=0; i<nums.length; i++){
            totalSum += nums[i];
            set.add(nums[i]);
        }

        for(Integer n:set){
            twiceSum += n;
        }

        System.out.println(set);
        return (twiceSum*2)-totalSum;
    }

    /**
     * this is done using XOR operation a^a = 0, a^0 = a
     * @param nums
     * @return
     */
    public int singleNumber2(int[] nums) {
        int a = 0;

        for(int n: nums){
            a = a^n;
        }
        return a;
    }
}
