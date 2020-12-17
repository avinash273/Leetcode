package Leetcode;

import java.util.*;

/**
 * this was medium problem in leetcode
 * very important kind, need to try
 */

class binaryTreeInorder {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> outputArr = new ArrayList<>();

        if(root == null){
            return outputArr;
        }

        TreeNode current = root;

        while(current != null || !stack.isEmpty()){
            while(current != null){
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            outputArr.add(current.val);
            current = current.right;
        }
        return outputArr;
    }
}
