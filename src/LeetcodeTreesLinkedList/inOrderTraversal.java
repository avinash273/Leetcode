package LeetcodeTreesLinkedList;

import java.util.*;

/**
 * T: O(n)
 * S: O(n)
 */

public class inOrderTraversal {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}

        TreeNode(int val){
            this.val = val;
        }

    }

    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> output = new ArrayList<>();

        TreeNode curr = root;

        while(curr != null || !stack.isEmpty()){
            while(curr != null){
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();
            output.add(curr.val);
            curr = curr.right;
        }
        return output;
    }
}
