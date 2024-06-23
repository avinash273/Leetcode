package org.code.Leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class validStack {
    static Map<Character, Character> map = new HashMap<Character,Character>();
    static{
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i < s.length(); i++ ){
            char c = s.charAt(i);

            if(map.containsKey(c)){
                stack.push(map.get(c));
            }
            else if(map.containsValue(c)){
                if(stack.isEmpty() || stack.pop() != c)
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
