package org.code.LeetcodeTreesLinkedList;

import java.util.HashMap;

/**
 * T: O(n)
 * S: O(n)
 */

public class maxWidthOfBinaryTree {

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
        int maxWidth;
        HashMap<Integer, Integer> leftMostPosition;

        public int widthOfBinaryTree(TreeNode root) {
            maxWidth = 0;
            leftMostPosition = new HashMap();
            getWidth(root, 0, 0);
            return maxWidth;
        }

        public void getWidth(TreeNode root, int depth, int position) {
            if (root == null)
                return;

            leftMostPosition.computeIfAbsent(depth, x -> position);
            maxWidth = Math.max(maxWidth, position - leftMostPosition.get(depth) + 1);
            getWidth(root.left, depth + 1, position * 2);
            getWidth(root.right, depth + 1, position * 2 + 1);
        }
    }
}
