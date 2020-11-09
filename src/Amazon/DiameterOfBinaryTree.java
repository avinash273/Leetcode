package Amazon;

/**
 * T: O(n)
 * S: O(n)
 */
public class DiameterOfBinaryTree {

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
        int numOfNodes;

        public int diameterOfBinaryTree(TreeNode root) {
            numOfNodes = 1;
            depth(root);
            return numOfNodes - 1; //for edges
        }

        public int depth(TreeNode node) {
            if (node == null) return 0;
            int depthL = depth(node.left);
            int depthR = depth(node.right);
            numOfNodes = Math.max(numOfNodes, depthL + depthR + 1);
            return Math.max(depthL, depthR) + 1;
        }
    }
}
