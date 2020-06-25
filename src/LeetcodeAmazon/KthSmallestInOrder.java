package LeetcodeAmazon;

/**
 * very important to learn inorder traversal
 * https://leetcode.com/problems/kth-smallest-element-in-a-bst/solution/
 * T: O(n)
 * S: O(n)
 */
public class KthSmallestInOrder {

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
        public int kthSmallest(TreeNode root, int k) {
            int[] nums = new int[2];
            inOrder(root, nums, k);
            return nums[1];
        }

        public void inOrder(TreeNode root, int[] nums, int k) {
            if (root == null)
                return;

            inOrder(root.left, nums, k);
            if (++nums[0] == k) {
                nums[1] = root.val;
            }

            inOrder(root.right, nums, k);
        }
    }
}
