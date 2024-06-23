package org.code.Leetcode;

import java.util.*;

// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};


class naryPreOrder {
    public List<Integer> preorder(Node root) {
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> outputArr = new LinkedList<>();

        if (root == null)
            return outputArr;

        stack.add(root);

        while (!stack.isEmpty()) {
            Node node = stack.pollLast();
            outputArr.add(node.val);
            Collections.reverse(node.children);
            for (Node child : node.children) {
                stack.add(child);
            }
        }
        return outputArr;
    }
}