package Amazon;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * T: O(m (4.3^(L-1)))
 * S: O(n)
 * m-cells in board
 * L-max len of words
 * n-no of letters
 */
public class WordSearchII {
    //https://www.youtube.com/watch?v=ZoMJbbYTWUo&ab_channel=RandomCoder
    class Trie {
        Set<String> word;
        Set<String> prefixes;

        public Trie() {
            word = new HashSet<>();
            prefixes = new HashSet<>();
        }

        public void insert(String words) {
            word.add(words);
            for (int i = 0; i <= words.length(); i++) {
                prefixes.add(words.substring(0, i));
            }
        }

        public boolean startsWith(String prefix) {
            return prefixes.contains(prefix);
        }

        public boolean search(String words) {
            return word.contains(words);
        }
    }


    class Solution {
        List<String> res = new ArrayList<>();
        Set<String> reps = new HashSet<>();
        Trie prefix = new Trie();
        char[][] gBoard;

        public List<String> findWords(char[][] board, String[] words) {
            gBoard = board;
            for (String word : words)
                prefix.insert(word);

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    if (prefix.startsWith(board[i][j] + "")) {
                        dfs(i, j, "");
                    }
                }
            }
            return res;
        }

        public void dfs(int i, int j, String store) {
            if (i < 0 || i >= gBoard.length || j < 0 || j >= gBoard[i].length
                    || gBoard[i][j] == 'A' || !prefix.startsWith(store)) return;

            store += gBoard[i][j] + "";
            if (prefix.search(store) && !reps.contains(store)) {
                reps.add(store);
                res.add(store);
            }
            char temp = gBoard[i][j];
            gBoard[i][j] = 'A'; //visited
            dfs(i + 1, j, store);
            dfs(i - 1, j, store);
            dfs(i, j + 1, store);
            dfs(i, j - 1, store);
            gBoard[i][j] = temp;
            store = store.substring(0, store.length() - 1);
        }
    }
}
