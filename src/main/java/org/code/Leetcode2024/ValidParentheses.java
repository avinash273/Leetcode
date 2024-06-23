package org.code.Leetcode2024;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char letter : s.toCharArray()){
            if(letter == '(') stack.push(')');
            else if(letter == '{') stack.push('}');
            else if(letter == '[') stack.push(']');
            else if(!stack.isEmpty()){
                if(stack.peek() != letter) return false;
                stack.pop();
            }
            else return false;

        }
        return stack.isEmpty();
    }
}
