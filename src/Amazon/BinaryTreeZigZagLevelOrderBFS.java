package Amazon;

/**
 *
 */
public class BinaryTreeZigZagLevelOrderBFS {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    class Solution {
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            List<List<Integer>> result = new ArrayList<>();
            if (root == null) return result;

            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            boolean even = true;

            while (!queue.isEmpty()) {
                int n = queue.size();
                LinkedList<Integer> currentLevel = new LinkedList<>();

                for (int i = 0; i < n; i++) {
                    TreeNode current = queue.poll();
                    if (current.left != null)
                        queue.add(current.left);
                    if (current.right != null)
                        queue.add(current.right);

                    if (even)
                        currentLevel.add(current.val);
                    else
                        currentLevel.addFirst(current.val);
                }
                result.add(currentLevel);
                even = !even;
            }
            return result;

        }
    }


}
