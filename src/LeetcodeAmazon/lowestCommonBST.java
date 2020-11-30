package LeetcodeAmazon;

/**
 * T: O(n)
 * S: O(n)
 * need to learn BST in depth
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/solution/
 */

public class lowestCommonBST {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (root == p || root == q || root == null)
                return root;
            TreeNode left = lowestCommonAncestor(root.left, p, q);
            TreeNode right = lowestCommonAncestor(root.right, p, q);

            if (left == null)
                return right;
            else if (right == null)
                return left;
            else
                return root;
        }
    }
}
