package org.code.LeetcodeTreesLinkedList;

/**
 * T: O(n)
 * S: O(n)
 */

public class invertBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public TreeNode invertTree(TreeNode root) {
            if (root == null)
                return root;

            TreeNode right = invertTree(root.right);
            TreeNode left = invertTree(root.left);

            root.left = right;
            root.right = left;

            return root;

        }
    }
}
