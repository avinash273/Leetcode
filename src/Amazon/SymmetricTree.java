package Amazon;



public class SymmetricTree {
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

    /**
     * T: O(n)
     * S: O(n)
     */
    class Solution {
        public boolean isSymmetric(TreeNode root) {
            if (root == null) return true;
            return mirror(root, root);
        }

        public boolean mirror(TreeNode tree1, TreeNode tree2) {
            if (tree1 == null && tree2 == null) return true;
            if (tree1 == null || tree2 == null) return false;

            return (tree1.val == tree2.val) && mirror(tree1.left, tree2.right) && mirror(tree1.right, tree2.left);
        }
    }
}
