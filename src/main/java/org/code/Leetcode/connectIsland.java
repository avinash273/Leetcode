package org.code.Leetcode;

class connectIsland {
    public int numIslands(char[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    callBFS(grid, i, j);
                }
            }
        }

        return count;
    }

    public void callBFS(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == '0')
            return;

        grid[i][j] = '0';
        callBFS(grid, i + 1, j);//up
        callBFS(grid, i - 1, j);//down
        callBFS(grid, i, j - 1);//left
        callBFS(grid, i, j + 1);//right

    }
}