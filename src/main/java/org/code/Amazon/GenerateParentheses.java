package org.code.Amazon;

import java.util.ArrayList;
import java.util.List;

/**
 * T: O(4^n/root(n))
 * S: O(4^n/root(n))
 */
public class GenerateParentheses {
    class Solution {
        //https://www.youtube.com/watch?v=qBbZ3tS0McI&ab_channel=NickWhite
        public List<String> generateParenthesis(int n) {
            List<String> output = new ArrayList<>();
            backtrack(output, "", 0, 0, n);
            return output;
        }

        public void backtrack(List<String> output, String currentString, int open, int close, int max) {
            if (currentString.length() == max * 2) {
                output.add(currentString);
                return;
            }

            if (open < max) backtrack(output, currentString + "(", open + 1, close, max);
            if (close < open) backtrack(output, currentString + ")", open, close + 1, max);
        }
    }
}
