package prep;

public class maxArea {
    class Solution {
        public int maxArea(int[] height) {
            int left = 0;
            int right = height.length - 1;
            int maxArea = 0;

            while (left < right) {
                if (height[left] > height[right]) {
                    maxArea = Math.max(maxArea, height[right] * (right - left));
                    right--;
                } else {
                    maxArea = Math.max(maxArea, height[left] * (right - left));
                    left++;
                }
            }

            while (left < right) {
                if (height[left] > height[right]) {
                    maxArea = Math.max(maxArea, height[right] * (right - left));
                    right--;
                }
            }

            return maxArea;
        }
    }
}
