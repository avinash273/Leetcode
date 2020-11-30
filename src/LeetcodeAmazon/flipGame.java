package LeetcodeAmazon;

import java.util.*;

/**
 * T: O(n^2)
 * S: O(n)
 */

public class flipGame {
    class Solution {
        public List<String> generatePossibleNextMoves(String s) {
            List<String> possibleStates = new ArrayList<>();
            int i = 0;
            while(i < s.length()){
                int nextMove = i == 0 ? s.indexOf("++") : s.indexOf("++", i);
                if(nextMove == -1)
                    return possibleStates;
                String nextState = s.substring(0, nextMove) + "--" + s.substring(nextMove + 2);
                possibleStates.add(nextState);
                i = nextMove + 1;
            }
            return possibleStates;
        }
    }
}
