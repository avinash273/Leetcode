package Leetcode;

public class trappingRainWater {
    class Solution {
        public int trap(int[] height) {
            if (height.length <= 2) return 0;

            int maxWater = 0;
            int left = 0;
            int right = height.length - 1;

            //get the left and right edge which can hold water
            while (left < right && height[left] <= height[left + 1]) left++;
            while (left < right && height[right] <= height[right - 1]) right--;

            while (left < right) {
                int heightL = height[left];
                int heightR = height[right];

                if (heightL < heightR) {
                    //add water until edge is larger that left height
                    while (left < right && heightL >= height[left]) {
                        maxWater += heightL - height[left];
                        left++;
                    }
                }
                //add water until edge is larger that right height
                else {
                    while (left < right && heightR >= height[right]) {
                        maxWater += heightR - height[right];
                        right--;
                    }
                }
            }
            return maxWater;
        }
    }
}
