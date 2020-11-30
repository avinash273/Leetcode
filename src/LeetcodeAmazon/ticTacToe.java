package LeetcodeAmazon;

public class ticTacToe {
    class TicTacToe {
        private int[] rowBoard;
        private int[] colBoard;
        private int diagonalSum = 0;
        private int antiDiagonalSum = 0;

        /**
         * Initialize your data structure here.
         */
        public TicTacToe(int n) {
            rowBoard = new int[n];
            colBoard = new int[n];

        }

        /**
         * Player {player} makes a move at ({row}, {col}).
         *
         * @param row    The row of the board.
         * @param col    The column of the board.
         * @param player The player, can be either 1 or 2.
         * @return The current winning condition, can be either:
         * 0: No one wins.
         * 1: Player 1 wins.
         * 2: Player 2 wins.
         */
        public int move(int row, int col, int player) {
            int playerValue = (player == 1) ? 1 : -1;

            if (row == col)
                diagonalSum += playerValue;

            if (col == (colBoard.length - 1 - row))
                antiDiagonalSum += playerValue;

            rowBoard[row] += playerValue;
            colBoard[col] += playerValue;

            int size = rowBoard.length;
            if ((Math.abs(diagonalSum) == size) ||
                    (Math.abs(antiDiagonalSum) == size) ||
                    (Math.abs(rowBoard[row]) == size) ||
                    (Math.abs(colBoard[col]) == size)) {
                return player;
            }
            return 0;

        }
    }

/**
 * Your TicTacToe object will be instantiated and called as such:
 * TicTacToe obj = new TicTacToe(n);
 * int param_1 = obj.move(row,col,player);
 */
}
