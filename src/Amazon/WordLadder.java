package Amazon;

import java.util.*;

/**
 * very imp and hard problem
 * Need to redo this atleast
 * T: O(M^2 N)
 * S: O(M^2 N)
 * M is the length of each word and
 * N is the total number of words in the input word list.
 */
//https://www.youtube.com/watch?v=PeyYhb8lJJU&ab_channel=AmellPeralta
public class WordLadder {
    class Solution {
        public int ladderLength(String beginWord, String endWord, List<String> wordList) {
            Set<String> wordSet = new HashSet<>(wordList);
            if (!wordSet.contains(endWord)) return 0;

            Queue<String> queue = new LinkedList<>();
            queue.add(beginWord);
            int level = 0;

            while (!queue.isEmpty()) {
                for (int k = queue.size(); k > 0; k--) {
                    String word = queue.poll();
                    if (word.equals(endWord))
                        return level + 1;
                    for (int i = 0; i < word.length(); i++) {
                        char[] newWord = word.toCharArray();
                        for (char ch = 'a'; ch <= 'z'; ch++) {
                            newWord[i] = ch;
                            String s = new String(newWord);
                            if (wordSet.contains(s) && !s.equals(word)) {
                                queue.add(s);
                                wordSet.remove(s);
                            }
                        }
                    }
                }
                level++;
            }
            return 0;
        }
    }
}
