package LeetcodeAmazon;

/**
 * T: O(n)
 * S: O(1)
 */
public class robotOrigin {
    class Solution {
        public boolean judgeCircle(String moves) {

            int up = 0;
            for(char move: moves.toCharArray()){
                if(move == 'U')
                    up++;
                else if(move == 'L')
                    up += 2;
                else if(move == 'D')
                    up--;
                else if(move == 'R')
                    up -= 2;
            }

            return up == 0;
        }
    }
}
