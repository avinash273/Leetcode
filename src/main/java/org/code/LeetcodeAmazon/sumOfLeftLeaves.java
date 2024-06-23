package org.code.LeetcodeAmazon;

/**
 * T: O(n)
 * S: O(n)
 * need to redo this
 * https://leetcode.com/problems/sum-of-left-leaves/solution/
 */

public class sumOfLeftLeaves {

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
        public int sumOfLeftLeaves(TreeNode root) {
            if (root == null)
                return 0;

            else if (root.left != null && root.left.left == null && root.left.right == null) {
                return root.left.val + sumOfLeftLeaves(root.right);
            } else {
                return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
            }
        }
    }
}
