package org.code.LeetcodeTreesLinkedList;

/**
 * T: O(log n) in most cases, worst O(n)
 * S: same as above, due to recursion stack built
 */

public class searchBST {

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
        public TreeNode searchBST(TreeNode root, int val) {
            if (root == null)
                return null;
            if (root.val == val)
                return root;

            if (val < root.val)
                return searchBST(root.left, val);
            else
                return searchBST(root.right, val);
        }
    }
}
