package org.code.LeetcodeAmazon;

/**
 * T: O(n) ~ supposedly
 * S: O(1)
 */
public class rotateImage {
    class Solution {
        public void rotate(int[][] matrix) {
            int n = matrix.length;

            //first transpose the matrix
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }

            //now we have to swap
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < (n / 2); j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[i][n - 1 - j];
                    matrix[i][n - 1 - j] = temp;
                }
            }
        }
    }
}
