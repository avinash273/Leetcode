package Amazon;

/**
 * T: O(n)
 * S: O(1)
 */
public class TrappingRainWater {
    class Solution {
        public int trap(int[] height) {
            int result = 0;
            int left = 0;
            int right = height.length - 1;

            int maxLeft = 0;
            int maxRight = 0;

            while(left < right){
                if(height[left] <= height[right]){
                    maxLeft = Math.max(maxLeft, height[left]);
                    result += maxLeft - height[left];
                    left++;
                }
                else{
                    maxRight = Math.max(maxRight, height[right]);
                    result += maxRight - height[right];
                    right--;
                }
            }
            return result;
        }
    }
}
