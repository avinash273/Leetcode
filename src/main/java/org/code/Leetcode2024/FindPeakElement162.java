package org.code.Leetcode2024;

public class FindPeakElement162 {
    public int findPeakElement(int[] nums) {
        int max = Integer.MIN_VALUE;
        int result = 0;

        for(int i = 0; i < nums.length; i++){
            if(max < nums[i]){
                result = i;
                max = nums[i];
            }
        }
        return result;
    }
}
