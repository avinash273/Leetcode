package Amazon;

import java.util.Arrays;
import java.util.HashSet;

/**
 * T: O(k min(N, 2^k))
 * S: O(K 2^k)
 * k - no cells
 * n - no steps
 */
public class PrisonCellsAfterNDays {
    class Solution {
        public int[] prisonAfterNDays(int[] cells, int N) {
            //https://www.youtube.com/watch?v=KcEtcBDX76w&t=9s&ab_channel=AnkurAgrawal
            HashSet<String> set = new HashSet<>();
            int size = 0;
            boolean flag = false;
            for (int i = 0; i < N; i++) {
                int[] nextStateValue = nextState(cells);
                String str = Arrays.toString(nextStateValue);
                if (!set.contains(str)) {
                    set.add(str);
                    size++;
                } else {
                    flag = true;
                    break;
                }
                cells = nextStateValue;
            }
            System.out.println(Arrays.toString(cells));
            if (flag) {
                N = N % size;
                for (int i = 1; i <= N; i++)
                    cells = nextState(cells);
            }
            return cells;
        }

        public int[] nextState(int[] cells) {
            int[] result = new int[cells.length];
            for (int i = 1; i < cells.length - 1; i++) {
                if (cells[i - 1] == cells[i + 1])
                    result[i] = 1;
            }
            return result;
        }
    }
}
