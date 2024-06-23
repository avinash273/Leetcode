package org.code.Amazon;

/**
 * T: O(m^2)
 * S: O(1)
 */
public class RotateImage {
    class Solution {
        public void rotate(int[][] matrix) {
            int n = matrix.length;

            //Step 1: Transpose the matrix(turns rows to cols)
            //Before: [[1,2,3],[4,5,6],[7,8,9]]
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    int temp = matrix[j][i];
                    matrix[j][i] = matrix[i][j];
                    matrix[i][j] = temp;
                }
            }
            //After: [[1,4,7],[2,5,8],[3,6,9]]
            //reverse each row
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n / 2; j++) {
                    int tmp = matrix[i][j];
                    matrix[i][j] = matrix[i][n - j - 1];
                    matrix[i][n - j - 1] = tmp;
                }
            }

        }
    }
}
