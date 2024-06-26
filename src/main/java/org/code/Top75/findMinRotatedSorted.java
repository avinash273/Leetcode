package org.code.Top75;

/**
 * T: O(log n)
 * S: O(1)
 */
public class findMinRotatedSorted {
    class Solution {
        public int findMin(int[] nums) {
            if(nums.length == 1) return nums[0];

            int left = 0;
            int right = nums.length - 1;

            if(nums[right] > nums[0]) return nums[0];

            while(left <= right){
                int mid = left + (right - left)/2;

                if(nums[mid] > nums[mid + 1]) return nums[mid + 1];

                if(nums[mid] < nums[mid - 1]) return nums[mid];

                if(nums[mid] > nums[0]){
                    left = mid + 1;
                }
                else{
                    right = mid - 1;
                }
            }
            return -1;
        }
    }
}
