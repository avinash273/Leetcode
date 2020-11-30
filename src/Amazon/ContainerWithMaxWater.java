package Amazon;

/**
 * T: O(n)
 * S: O(1)
 * First, I wasn't able to do this. But, now I can
 * Practice improves your skills
 */
public class ContainerWithMaxWater {
    class Solution {
        public int maxArea(int[] height) {
            int maxWater = 0;
            int left = 0;
            int right = height.length - 1;

            while (left < right) {
                maxWater = Math.max(maxWater, (Math.min(height[left], height[right]) * (right - left)));
                if (height[left] < height[right])
                    left++;
                else
                    right--;
            }
            return maxWater;
        }
    }
}
