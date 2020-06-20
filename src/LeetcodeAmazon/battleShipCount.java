package LeetcodeAmazon;

/**
 * T: O(n)
 * S: O(n)
 */

public class battleShipCount {
    class Solution1 {
        public int countBattleships(char[][] board) {
            int numBattleships = 0;
            for(int i = 0; i < board.length; i++){
                for(int j = 0; j<board[i].length; j++){
                    if(board[i][j] == 'X'){
                        numBattleships += sink(board, i, j);
                    }
                }
            }
            return numBattleships;
        }

        public int sink(char[][] board, int i, int j){
            if(i < 0 || j < 0 || i >= board.length || j >= board[i].length || board[i][j] != 'X'){
                return 0;
            }

            board[i][j] = '.';
            sink(board, i+1, j);
            sink(board, i-1, j);
            sink(board, i, j+1);
            sink(board, i, j+1);

            return 1;
        }
    }

}
