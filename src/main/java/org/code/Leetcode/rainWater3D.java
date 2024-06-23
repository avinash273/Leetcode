package org.code.Leetcode;

class rainWater3D {
    public int trapRainWater(int[][] heightMap) {
        int left = 0;
        int right = heightMap[0].length - 1;
        int leftMax = 0, rightMax = 0;
        int ans = 0, mainAns = 0;
        int i = 1;
        while (i < heightMap[0].length - 1) {
            while (left < right) {
                if (heightMap[i][left] < heightMap[i][right]) {
                    if (heightMap[0][left] >= leftMax)
                        leftMax = heightMap[0][left];
                    else
                        ans += (leftMax - heightMap[i][left]);
                    left++;
                } else {
                    if (heightMap[i][right] >= rightMax)
                        rightMax = heightMap[i][right];
                    else
                        ans += (rightMax - heightMap[i][right]);
                    right--;
                }
            }
            mainAns += ans;
            i++;
        }
        return mainAns;
    }
}