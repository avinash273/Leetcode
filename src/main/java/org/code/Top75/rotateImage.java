package org.code.Top75;

/**
 * T: O(mn)
 * S: O(1)
 */
public class rotateImage {
    //https://www.youtube.com/watch?v=SA867FvqHrM
    class Solution {
        public void rotate(int[][] matrix) {
        /*requires to steps:
        1. Transpose the arrays
        2. Then flip points
        */

            int n = matrix.length;

            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n / 2; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[i][n - 1 - j];
                    matrix[i][n - 1 - j] = temp;
                }
            }
        }
    }
}
