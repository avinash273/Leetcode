package LeetcodeAmazon;

/**
 * T: O(MxN)
 * S: O(min(m,n))
 */

public class islandCount {
    class Solution {
        public int numIslands(char[][] grid) {
            if (grid == null || grid.length <= 0)
                return 0;

            int numIslands = 0;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    System.out.println("i " + i + " j " + j);
                    if (grid[i][j] == '1')
                        numIslands += dfs(grid, i, j);
                }
            }
            return numIslands;
        }

        public int dfs(char[][] grid, int i, int j) {
            if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == '0')
                return 0;

            grid[i][j] = '0';
            //down
            dfs(grid, i + 1, j);
            //up
            dfs(grid, i - 1, j);
            //right
            dfs(grid, i, j + 1);
            //left
            dfs(grid, i, j - 1);


            return 1;
        }
    }
}



