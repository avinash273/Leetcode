package LeetcodeDFS;

/**
 * Another DFS problem, need to revisit
 * felt good solving this one
 *https://leetcode.com/problems/walls-and-gates/
 * T: O(m x n)
 * S: O(m x n)
 */

public class wallsAndGates {
    class Solution {
        public void wallsAndGates(int[][] rooms) {
            for(int i = 0; i < rooms.length; i++){
                for(int j = 0; j < rooms[i].length; j++){
                    if(rooms[i][j] == 0)
                        dfs(i, j, 0, rooms);
                }
            }
        }

        private void dfs(int i, int j, int count, int[][] rooms){
            if(i < 0 || i >= rooms.length || j < 0 || j >= rooms[i].length || rooms[i][j] < count)
                return;

            rooms[i][j] = count;
            dfs(i + 1, j, count + 1, rooms);
            dfs(i - 1, j, count + 1, rooms);
            dfs(i, j + 1, count + 1, rooms);
            dfs(i, j - 1, count + 1, rooms);

        }
    }
}
