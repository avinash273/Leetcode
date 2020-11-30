package prep;

import java.util.HashSet;
import java.util.Set;

public class numJewelsInStones {
    class Solution {
        public int numJewelsInStones(String J, String S) {
            Set<Character> set = new HashSet<>();
            int result = 0;

            for (char c : J.toCharArray())
                set.add(c);

            for (char stone : S.toCharArray()) {
                if (set.contains(stone))
                    result++;
            }
            return result;
        }
    }
}
