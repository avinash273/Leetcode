package org.code.LeetcodeAmazon;

/**
 * T: O(n)
 * S: O(1)
 * I did well, first compilation to direct submission in one go
 *
 */

public class containerWithMostWater {
    class Solution {
        public int maxArea(int[] height) {
            if(height == null || height.length <= 0)
                return 0;

            int left = 0;
            int right = height.length - 1;

            int maxVolume = 0;

            while(left < right){
                int minHeight = Math.min(height[left],height[right]);
                int breadth = right - left;
                maxVolume = Math.max(maxVolume, (minHeight * breadth));

                if(height[left] > height[right])
                    right--;
                else
                    left++;
            }
            return maxVolume;
        }
    }
}
