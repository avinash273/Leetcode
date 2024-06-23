package org.code.YoutuberKevin;

/**
 * T: O(mn)
 * S: O(mn)
 */
public class NumIslands {
    class Solution {
        public int numIslands(char[][] grid) {
            if (grid.length == 0 || grid == null) return 0;

            int islandCount = 0;

            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    if (grid[i][j] == '1')
                        islandCount += DFS(grid, i, j);
                }
            }
            return islandCount;
        }

        private int DFS(char[][] grid, int i, int j) {
            if (i >= grid.length || i < 0 || j >= grid[i].length || j < 0 || grid[i][j] == '0')
                return 0;

            grid[i][j] = '0';

            //down
            DFS(grid, i + 1, j);
            //up
            DFS(grid, i - 1, j);
            //left
            DFS(grid, i, j + 1);
            //right
            DFS(grid, i, j - 1);

            return 1;
        }
    }
}
