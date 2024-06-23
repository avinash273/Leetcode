package org.code.LeetcodeAmazon;

import java.util.HashSet;
import java.util.Set;

/**
 * T: O(J + S)
 * S: O(J)
 */
public class jewelsStones {
    class Solution {
        public int numJewelsInStones(String J, String S) {
            Set<Character> set = new HashSet<Character>();
            int output = 0;
            if(J.length() == 0 || S.length() == 0)
                return 0;

            for(char each:J.toCharArray()){
                set.add(each);
            }

            for(char each:S.toCharArray()){
                if(set.contains(each))
                    output++;
            }
            return output;
        }
    }
}
