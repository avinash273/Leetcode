package org.code.PracticeYoutuber.Stack;

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

    //https://leetcode.com/problems/valid-parentheses/discuss/9178/Short-java-solution
    class Solution2 {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();

            for(char each : s.toCharArray()){
                if(each == '[') stack.push(']');
                else if(each == '{') stack.push('}');
                else if(each == '(') stack.push(')');
                else if(stack.isEmpty() || stack.pop() != each) return false;
            }
            return stack.isEmpty();
        }
    }




}
