package org.code.Top75;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * T: O(n^2)
 * S: O(n)
 * need to redo again
 */
public class wordBreak {
    class Solution {
        public boolean wordBreak(String s, List<String> wordDict) {
            Set<String> wordDictSet = new HashSet(wordDict);
            boolean[] dp = new boolean[s.length() + 1];
            dp[0] = true;

            for (int i = 1; i <= s.length(); i++) {
                for (int j = 0; j < i; j++) {
                    if (dp[j] == true && wordDictSet.contains(s.substring(j, i))) {
                        dp[i] = true;
                    }
                }
            }
            return dp[s.length()];
        }
    }
}
