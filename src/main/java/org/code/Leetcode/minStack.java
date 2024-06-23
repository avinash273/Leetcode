package org.code.Leetcode;

import java.util.Stack;

class minStack {

    /** initialize your data structure here. */
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> minValue = new Stack<Integer>();

    public void push(int x) {
        if(minValue.isEmpty() || x <= minValue.peek()){
            minValue.push(x);
        }
        stack.push(x);
    }

    public void pop() {
        if(stack.peek().equals(minValue.peek())){
            minValue.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minValue.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
