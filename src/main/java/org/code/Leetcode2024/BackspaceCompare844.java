package org.code.Leetcode2024;

import java.util.Stack;

public class BackspaceCompare844 {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stackS = new Stack<>();
        Stack<Character> stackT = new Stack<>();

        for(char c : s.toCharArray()){
            if( c == '#'){
                if(!stackS.isEmpty()) stackS.pop();
            }
            else{
                stackS.push(c);
            }
        }

        for(char c : t.toCharArray()){
            if(c == '#'){
                if(!stackT.isEmpty()) stackT.pop();
            }
            else{
                stackT.push(c);
            }
        }

        if(stackS.size() != stackT.size())return false;

        while(!stackS.isEmpty()){
            if(stackS.pop() != stackT.pop()) return false;
        }

        return true;
    }
}
