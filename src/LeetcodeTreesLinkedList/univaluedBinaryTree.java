package LeetcodeTreesLinkedList;

/**
 * https://leetcode.com/problems/univalued-binary-tree/
 * T: O(n)
 * S: O(n)
 */

public class univaluedBinaryTree {

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
        public boolean isUnivalTree(TreeNode root) {
            boolean leftCheck = (root.left == null || (root.val == root.left.val && isUnivalTree(root.left)));

            boolean rightCheck = (root.right == null || (root.val == root.right.val && isUnivalTree(root.right)));

            return leftCheck && rightCheck;
        }
    }
}
