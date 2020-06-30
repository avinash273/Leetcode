package LeetcodeAmazon;

import java.util.Stack;

public class removeKdigitsGreedy {
    class Solution {
        public String removeKdigits(String num, int k) {
            int size = num.length();

            if (k == size)
                return "0";

            Stack<Character> stack = new Stack<>();

            int counter = 0;
            while (counter < size) {
                while (k > 0 && !stack.isEmpty() && stack.peek() > num.charAt(counter)) {
                    stack.pop();
                    k--;
                }
                stack.push(num.charAt(counter));
                counter++;
            }

            while (k > 0) {
                stack.pop();
                k--;
            }

            StringBuilder sb = new StringBuilder();
            while (!stack.isEmpty()) {
                char currentChar = stack.pop();
                sb.append(currentChar);
            }

            sb.reverse();

            while (sb.length() > 1 && sb.charAt(0) == '0')
                sb.deleteCharAt(0);

            return sb.toString();
        }
    }
}
