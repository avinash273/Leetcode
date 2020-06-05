package Leetcode;
import java.util.*;

// Definition for a Node in other class
class naryPostOrder {
    public List<Integer> postorder(Node root) {
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> outputArr = new LinkedList<>();

        if(root == null)
            return outputArr;

        stack.add(root);

        while(!stack.isEmpty()){
            Node node = stack.pollLast();
            outputArr.addFirst(node.val);
            for(Node child: node.children){
                stack.add(child);
            }
        }
        return outputArr;
    }
}