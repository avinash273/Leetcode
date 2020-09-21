package PracticeYoutuber.Top75.Tree;

public class MaxDepthBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

    class Solution {
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
}
