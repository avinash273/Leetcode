package LeetcodeAmazon;

/**
 * T: O(n^2)
 * S: O(row * col)
 */

public class transposeMatrix {
    class Solution {
        public int[][] transpose(int[][] A) {

            int row = A.length;
            int col = A[0].length;

            int[][] matrix = new int[col][row];

            for(int i = 0; i < row; i++){
                for(int j = 0; j < col; j++){
                    matrix[j][i] = A[i][j];
                }
            }
            return matrix;
        }
    }
}
