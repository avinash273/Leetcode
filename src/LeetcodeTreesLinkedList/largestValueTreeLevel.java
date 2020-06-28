package LeetcodeTreesLinkedList;

import java.util.*;

/**
 * T: O(n)
 * S: O(n)
 */

public class largestValueTreeLevel {

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
        public List<Integer> largestValues(TreeNode root) {
            List<Integer> largestVals = new ArrayList<>();

            helperMethod(root, largestVals, 0);
            return largestVals;
        }

        void helperMethod(TreeNode root, List<Integer> largestVals, Integer level) {
            if (root == null)
                return;

            if (level == largestVals.size())
                largestVals.add(root.val);
            else
                largestVals.set(level, Math.max(largestVals.get(level), root.val));

            helperMethod(root.left, largestVals, level + 1);
            helperMethod(root.right, largestVals, level + 1);
        }
    }
}
