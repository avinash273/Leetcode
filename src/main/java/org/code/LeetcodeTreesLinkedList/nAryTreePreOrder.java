package org.code.LeetcodeTreesLinkedList;

import java.util.LinkedList;
import java.util.List;

public class nAryTreePreOrder {

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
    }

    ;


    class Solution {
        public List<Integer> postorder(Node root) {
            LinkedList<Node> stack = new LinkedList<>();
            LinkedList<Integer> output = new LinkedList<>();

            if (root == null)
                return output;

            stack.add(root);

            while (!stack.isEmpty()) {
                Node node = stack.pollLast();
                output.addFirst(node.val);
                for (Node child : node.children) {
                    stack.add(child);
                }
            }
            return output;
        }
    }
}
