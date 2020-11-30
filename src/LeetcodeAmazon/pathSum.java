package LeetcodeAmazon;

/**
 * T: O(n)
 * S: O(n)
 */
public class pathSum {
     public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }
    class Solution {
        public boolean hasPathSum(TreeNode root, int sum) {
            if(root == null)
                return false;
            else if(root.left == null && root.right == null && sum - root.val == 0)
                return true;
            else
                return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
        }
    }
}
