package LeetcodeAmazon;

/**
 * T: O(mn)
 * S: O(m+n)
 */
public class maxIncreasingKeepingSkyline {
    class Solution {
        public int maxIncreaseKeepingSkyline(int[][] grid) {
            int result = 0;
            int n = grid.length;


            int[] maxRowVal = new int[n];
            int[] maxColVal = new int[n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    maxRowVal[i] = Math.max(maxRowVal[i], grid[i][j]);
                    maxColVal[j] = Math.max(maxColVal[j], grid[i][j]);
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    result += Math.min(maxRowVal[i], maxColVal[j]) - grid[i][j];
                }
            }
            return result;
        }
    }
}
