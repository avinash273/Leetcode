package org.code.LeetcodeAmazon;

import java.util.Stack;

public class validParentheses {
    /**
     * T:O(n)
     * S:O(n)
     */

    class Solution {
        public boolean isValid(String s) {
            if (s == null || s.length() <= 0)
                return true;

            Stack<Character> stack = new Stack<Character>();

            for (char each : s.toCharArray()) {
                if (each == '(' || each == '[' || each == '{')
                    stack.push(each);
                else if (each == ')' && !stack.isEmpty() && stack.peek() == '(')
                    stack.pop();
                else if (each == ']' && !stack.isEmpty() && stack.peek() == '[')
                    stack.pop();
                else if (each == '}' && !stack.isEmpty() && stack.peek() == '{')
                    stack.pop();
                else
                    return false;

            }

            return stack.isEmpty();

        }
    }
}