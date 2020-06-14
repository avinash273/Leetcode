package LeetcodeAmazon;

import java.util.Stack;

/**
 * T: O(n)
 * S: O(m+n)
 */

public class backspaceString {
    class Solution {
        public boolean backspaceCompare(String S, String T) {
            Stack<Character> sStack = new Stack<Character>();
            Stack<Character> tStack = new Stack<Character>();
            sStack = backspace(S);
            tStack = backspace(T);

            System.out.println(sStack);
            System.out.println(tStack);

            while(!sStack.isEmpty() && !tStack.isEmpty()){
                if(sStack.peek() == tStack.peek()){
                    sStack.pop();
                    tStack.pop();
                }
                else
                    return false;
            }
            return sStack.isEmpty() && tStack.isEmpty();
        }

        Stack backspace(String str){
            Stack<Character> stack = new Stack<Character>();
            for(char c: str.toCharArray()){
                if(c != '#')
                    stack.push(c);
                else if(!stack.isEmpty())
                    stack.pop();
            }
            return stack;
        }
    }
}
