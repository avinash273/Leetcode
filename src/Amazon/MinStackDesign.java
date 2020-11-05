package Amazon;

import java.util.Stack;

/**
 * T: O(1)
 * S: O(n)
 * think simple, not linked list
 */
public class MinStackDesign {
    class MinStack {
        private Stack<Integer> stack = new Stack<>();
        private Stack<Integer> minStack = new Stack<>();

        public MinStack() {
            //nothing
        }

        public void push(int x) {
            stack.push(x);
            if (minStack.isEmpty() || x <= minStack.peek())
                minStack.push(x);
        }

        public void pop() {
            if (stack.peek().equals(minStack.peek()))
                minStack.pop();
            stack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }


}
