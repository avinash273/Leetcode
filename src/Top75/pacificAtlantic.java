package Top75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class pacificAtlantic {
    class Solution {
        public List<List<Integer>> pacificAtlantic(int[][] matrix) {
            if (matrix.length == 0) return new ArrayList<List<Integer>>();

            int[][] pacific = new int[matrix.length][matrix[0].length];
            int[][] atlantic = new int[matrix.length][matrix[0].length];

            //top and bottom
            for (int col = 0; col < matrix[0].length; col++) {
                dfs(matrix, 0, col, Integer.MIN_VALUE, pacific);
                dfs(matrix, matrix.length - 1, col, Integer.MIN_VALUE, atlantic);
            }

            //left and right
            for (int row = 0; row < matrix.length; row++) {
                dfs(matrix, row, 0, Integer.MIN_VALUE, pacific);
                dfs(matrix, row, matrix[0].length - 1, Integer.MIN_VALUE, atlantic);
            }

            ArrayList<List<Integer>> res = new ArrayList<>();

            //get common elements
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (pacific[i][j] == 1 && atlantic[i][j] == 1) {
                        res.add(Arrays.asList(i, j));
                    }
                }
            }
            return res;
        }

        private void dfs(int[][] matrix, int row, int col, int prevVal, int[][] ocean) {
            //1. check necessary conditions
            if (row < 0 || col < 0 || row > matrix.length - 1 || col > matrix[0].length - 1) return;

            if (matrix[row][col] < prevVal) return;

            if (ocean[row][col] == 1) return;

            //2. process the cell
            ocean[row][col] = 1;

            //3. call DFS as needed
            dfs(matrix, row - 1, col, matrix[row][col], ocean);
            dfs(matrix, row + 1, col, matrix[row][col], ocean);
            dfs(matrix, row, col - 1, matrix[row][col], ocean);
            dfs(matrix, row, col + 1, matrix[row][col], ocean);
        }
    }
}
