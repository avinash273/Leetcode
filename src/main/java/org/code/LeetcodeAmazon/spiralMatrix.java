package org.code.LeetcodeAmazon;

import java.util.ArrayList;
import java.util.List;

/**
 * T: O(m * n)
 * S: O(m * n)
 */

public class spiralMatrix {
    class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            ArrayList<Integer> nums = new ArrayList<>();
            if (matrix == null || matrix.length == 0)
                return nums;

            //getting the bounds of the matrix
            int top = 0;
            int bottom = matrix.length - 1;
            int left = 0;
            int right = matrix[0].length - 1;

            int size = matrix.length * matrix[0].length;

            //stopping condition to check if nums has exactly as size
            while (nums.size() < size) {
                //going from left to right
                for (int i = left; i <= right && nums.size() < size; i++)
                    nums.add(matrix[top][i]);
                top++;//to ensure, last element is not added again

                //going from top to bottom
                for (int i = top; i <= bottom && nums.size() < size; i++)
                    nums.add(matrix[i][right]);
                right--;

                //going from bottom right to left
                for (int i = right; i >= left && nums.size() < size; i--)
                    nums.add(matrix[bottom][i]);
                bottom--;

                //going from bottom up
                for (int i = bottom; i >= top && nums.size() < size; i--)
                    nums.add(matrix[i][left]);
                left++;
            }
            return nums;
        }
    }
}
