package org.code.LeetcodeAmazon;

/**
 * T: O(n^2)
 * S: O(1) -> O(n^2)
 */
public class spiralMatrixII {
    class Solution {
        public int[][] generateMatrix(int n) {
            int[][] matrix = new int[n][n];

            int rowBegin = 0;
            int rowEnd = n - 1;
            int colBegin = 0;
            int colEnd = n - 1;

            int counter = 1;

            while (rowBegin <= rowEnd && colBegin <= colEnd) {

                for (int i = colBegin; i <= colEnd; i++)
                    matrix[rowBegin][i] = counter++;

                rowBegin++;

                for (int i = rowBegin; i <= rowEnd; i++)
                    matrix[i][colEnd] = counter++;
                colEnd--;

                if (rowBegin <= rowEnd) {
                    for (int i = colEnd; i >= colBegin; i--)
                        matrix[rowEnd][i] = counter++;
                }
                rowEnd--;

                if (colBegin <= colEnd) {
                    for (int i = rowEnd; i >= rowBegin; i--)
                        matrix[i][colBegin] = counter++;
                }
                colBegin++;
            }
            return matrix;
        }
    }
}
