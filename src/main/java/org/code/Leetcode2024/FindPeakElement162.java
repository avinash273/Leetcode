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

    public int findPeakElementBinarySearch(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while(left < right){
            int mid = left + (right - left)/2;
            if(nums[mid] < nums[mid + 1]){
                left = mid + 1;
            }
            else{
                right = mid;
            }
        }
        return left;
    }

}
