package org.code.Amazon;

import java.util.Stack;

/**
 * T: O(n)
 * S: O(n)
 */
public class ValidParanthesis {
    class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();

            for (char each : s.toCharArray()) {
                if (each == '(')
                    stack.push(')');
                else if (each == '[')
                    stack.push(']');
                else if (each == '{')
                    stack.push('}');
                else if (stack.isEmpty() || stack.pop() != each)
                    return false;
            }
            return stack.isEmpty();
        }
    }
}
