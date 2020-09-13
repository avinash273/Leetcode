package PracticeYoutuber.DFS;

/**
 * T: O(n)
 * S: O(n)
 */
public class NumIslands200 {
    class Solution {
        public int numIslands(char[][] grid) {
            if (grid == null || grid.length == 0) return 0;

            int numIslands = 0;

            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    if (grid[i][j] == '1') {
                        numIslands += DFS(grid, i, j);
                    }
                }
            }
            return numIslands;
        }

        public int DFS(char[][] grid, int i, int j) {
            if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == '0') return 0;

            grid[i][j] = '0';
            //down
            DFS(grid, i + 1, j);
            //up
            DFS(grid, i - 1, j);
            //right
            DFS(grid, i, j + 1);
            //left
            DFS(grid, i, j - 1);
            return 1;
        }
    }

    class Solution2 {
        public int numIslands(char[][] grid) {
            int numIslands = 0;

            for(int i = 0; i < grid.length; i++){
                for(int j = 0; j < grid[i].length; j++){
                    if(grid[i][j] == '1')
                        numIslands += DFS(grid, i, j);
                }
            }
            return numIslands;
        }

        public int DFS(char[][] grid, int i, int j){
            if(i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == '0') return 0;

            grid[i][j] = '0';
            //down
            DFS(grid, i + 1, j);
            //up
            DFS(grid, i - 1, j);
            //left
            DFS(grid, i, j - 1);
            //right
            DFS(grid, i, j + 1);
            return 1;
        }
    }



}
