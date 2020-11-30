package Amazon;


import java.util.LinkedList;
import java.util.Queue;

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
     * Recursive
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

    /**
     * Iterative
     * T: O(n)
     * S: O(n)
     */
    class Solution2 {
        public boolean isSymmetric(TreeNode root) {
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            q.add(root);

            while(!q.isEmpty()){
                TreeNode t1 = q.poll();
                TreeNode t2 = q.poll();

                if(t1 == null && t2 == null) continue;
                if(t1 == null || t2 == null) return false;
                if(t1.val != t2.val) return false;
                q.add(t1.left);
                q.add(t2.right);
                q.add(t1.right);
                q.add(t2.left);
            }
            return true;
        }
    }
}
