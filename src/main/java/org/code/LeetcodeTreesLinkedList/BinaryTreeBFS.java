package org.code.LeetcodeTreesLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Breadth First Search
 * Most Important, need to do again
 * T: O(n)
 * S: O(n)
 */


public class BinaryTreeBFS {
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

        class Solution {
            public List<List<Integer>> levelOrder(TreeNode root) {
                List<List<Integer>> result = new ArrayList<>();
                if (root == null)
                    return result;

                Queue<TreeNode> queue = new LinkedList<>();
                queue.add(root);

                while (!queue.isEmpty()) {
                    int size = queue.size();
                    List<Integer> currentLevel = new ArrayList<>();
                    for (int i = 0; i < size; i++) {
                        TreeNode current = queue.remove();
                        currentLevel.add(current.val);

                        if (current.left != null)
                            queue.add(current.left);
                        if (current.right != null)
                            queue.add(current.right);
                    }
                    result.add(currentLevel);
                }
                return result;
            }
        }
    }
}
