package YoutuberKevin;

import java.util.Stack;

/**
 * T: O(n)
 * S: O(n)
 */
public class ValidParantheses {
    class Solution {
        public boolean isValid(String s) {
            if (s == null || s.length() == 0) return false;

            Stack<Character> stack = new Stack<>();

            for (char brace : s.toCharArray()) {
                if (brace == '{')
                    stack.push('}');
                else if (brace == '(')
                    stack.push(')');
                else if (brace == '[')
                    stack.push(']');
                else if (stack.isEmpty() || stack.pop() != brace)
                    return false;
            }
            return stack.isEmpty();
        }
    }
}
