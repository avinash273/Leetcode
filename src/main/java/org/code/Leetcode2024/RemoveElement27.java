package org.code.Leetcode2024;

public class RemoveElement27 {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            if(nums[left] == val){
                nums[left] = nums[right--];
            }
            else left++;
        }
        return left;
    }
}
