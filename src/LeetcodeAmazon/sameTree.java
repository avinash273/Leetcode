package LeetcodeAmazon;

/**
 * Its simple but, its the base for tree recursion
 * T: O(n)
 * S: O(n)
 * https://leetcode.com/problems/same-tree/submissions/
 */
public class sameTree {
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
        public boolean isSameTree(TreeNode p, TreeNode q) {
            if (p == null && q == null)
                return true;
            else if (p == null || q == null)
                return false;
            else if (p.val != q.val)
                return false;
            else {
                return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
            }

        }
    }
}
