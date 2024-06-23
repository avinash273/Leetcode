package org.code.LeetcodeTreesLinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * T: O(n)
 * S: O(n)
 */
public class BinaryPreTraversal {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}

        TreeNode(int val){
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<Integer> preOrderTraversal(TreeNode root){
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> output = new ArrayList<Integer>();

        if(root == null)
            return output;

        stack.add(root);

        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            output.add(node.val);

            if(node.right != null){
                stack.add(node.right);
            }

            if(node.left != null){
                stack.add(node.left);
            }
        }
        return output;
    }

}
