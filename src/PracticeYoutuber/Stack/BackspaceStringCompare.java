package PracticeYoutuber.Stack;

import java.util.Stack;

/**
 * T: O()
 */
public class BackspaceStringCompare {
    class Solution {
        public boolean backspaceCompare(String S, String T) {
            Stack<Character> stackS = new Stack<>();
            Stack<Character> stackT = new Stack<>();

            for (char each : S.toCharArray()) {
                if (each == '#' && !stackS.isEmpty())
                    stackS.pop();
                else if (each != '#')
                    stackS.push(each);
            }

            for (char each : T.toCharArray()) {
                if (each == '#' && !stackT.isEmpty())
                    stackT.pop();
                else if (each != '#')
                    stackT.push(each);
            }

            if (stackT.size() != stackS.size()) return false;

            while (!stackS.isEmpty()) {
                if (stackS.pop() != stackT.pop()) return false;
            }
            return true;
        }
    }
}
