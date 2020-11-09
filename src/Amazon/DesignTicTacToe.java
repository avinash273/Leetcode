package Amazon;

/**
 * T: O(1)
 * S: O(n)
 */
public class DesignTicTacToe {
    class TicTacToe {
        private int[] rows;
        private int[] cols;
        private int diagonal;
        private int antiDiagonal;

        public TicTacToe(int n) {
            rows = new int[n];
            cols = new int[n];
        }

        public int move(int row, int col, int player) {
            int toAdd = (player == 1) ? 1 : -1;
            int size = rows.length;

            rows[row] += toAdd;
            cols[col] += toAdd;

            if (row == col)
                diagonal += toAdd;

            if ((row + col) == size - 1)
                antiDiagonal += toAdd;

            if (Math.abs(rows[row]) == size ||
                    Math.abs(cols[col]) == size ||
                    Math.abs(diagonal) == size ||
                    Math.abs(antiDiagonal) == size) {
                return player;
            }
            return 0;
        }
    }

}
