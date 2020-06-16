package LeetcodeAmazon;

/**
 * T: O(n)
 * S: O(n).O(n) to keep the output and O(log n) for recursive stack
 */

public class sortedArrayBST {
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
//Preorder Traversal: Always Choose Left Middle Node as a Root
    class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {
            if(nums == null || nums.length <= 0)
                return null;

            return constructBST(nums, 0, nums.length-1);
        }

        private TreeNode constructBST(int[] nums, int left, int right){
            if(left > right)
                return null;

            int mid = left + (right - left)/2;
            TreeNode current = new TreeNode(nums[mid]);
            current.left = constructBST(nums, left, mid-1);
            current.right = constructBST(nums, mid+1, right);
            return current;
        }
    }
}
