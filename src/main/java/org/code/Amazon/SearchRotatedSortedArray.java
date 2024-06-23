package org.code.Amazon;

/**
 * T: O(log n)
 * S: O(1)
 */
public class SearchRotatedSortedArray {
    class Solution {
        public int search(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            int mid = 0;

            //step1: get lowest index where the array splits
            while (left < right) {
                mid = left + (right - left) / 2;
                if (nums[mid] > nums[right])
                    left = mid + 1;
                else
                    right = mid;
            }

            //we have left pointer with lowest index
            int start = left;
            mid = 0;
            left = 0;
            right = nums.length - 1;

            //step2: find target on left or right side
            if (nums[start] <= target && nums[right] >= target)
                left = start;
            else
                right = start;

            //step3 do regular binary search
            while (left <= right) {
                mid = left + (right - left) / 2;
                if (nums[mid] == target)
                    return mid;
                else if (nums[mid] < target)
                    left = mid + 1;
                else
                    right = mid - 1;
            }
            return -1;
        }
    }
}
