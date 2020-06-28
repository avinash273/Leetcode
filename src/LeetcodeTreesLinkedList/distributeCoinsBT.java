package LeetcodeTreesLinkedList;

public class distributeCoinsBT {

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
        int result;

        public int distributeCoins(TreeNode root) {
            result = 0;
            dfs(root);
            return result;
        }

        public int dfs(TreeNode root) {
            if (root == null)
                return 0;

            int left = dfs(root.left);
            int right = dfs(root.right);
            result += Math.abs(left) + Math.abs(right);
            return root.val + left + right - 1;
        }
    }
}
