package PracticeYoutuber.Stack;

import java.util.Stack;

/**
 * T: O(n)
 * S: O(n)
 */
public class ValidParentheses20 {
    //https://leetcode.com/problems/valid-parentheses/discuss/9178/Short-java-solution
    class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            for (char bracket : s.toCharArray()) {
                if (bracket == '{') stack.push('}');
                else if (bracket == '[') stack.push(']');
                else if (bracket == '(') stack.push(')');
                else if (stack.isEmpty() || stack.pop() != bracket) return false;
            }
            return stack.isEmpty();
        }
    }


}
