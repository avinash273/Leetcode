package LeetcodeTreesLinkedList;

/**
 * T: O(n)
 * S: O(log n)
 */
public class binaryTreeMaximumPathSum {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        TreeNode(){

        }
    }

    class Solution {
        int maxPathSum = Integer.MIN_VALUE;

        public int maxPathSum(TreeNode root) {
            maxPathSum = Integer.MIN_VALUE;
            pathSum(root);
            return maxPathSum;
        }

        public int pathSum(TreeNode node) {
            if (node == null)
                return 0;

            int left = Math.max(0, pathSum(node.left));
            int right = Math.max(0, pathSum(node.right));

            maxPathSum = Math.max(maxPathSum, left + right + node.val);

            return Math.max(left, right) + node.val;
        }
    }
}
