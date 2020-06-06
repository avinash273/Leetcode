package Leetcode;


/**
 * Definition for a binary tree node.
 */

class maxDepthTree {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        else {
            int leftHeight = maxDepth(root.left);
            int rightHeight = maxDepth(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
}