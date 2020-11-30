package Leetcode;

class containerMaxWater {
    public int maxArea(int[] height) {
        int size = height.length;
        int left = 0, right = size -1;
        int maxWater = 0;

        while(left < right){
            if(height[left] <= height[right]){
                maxWater = Math.max(maxWater, (height[left] * (right-left)));
                left++;
            }
            else{
                maxWater = Math.max(maxWater, (height[right] * (right-left)));
                right--;
            }
        }
        return maxWater;
    }
}
