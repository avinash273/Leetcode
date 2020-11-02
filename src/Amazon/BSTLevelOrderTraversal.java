package Amazon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * T: O(n)
 * S: O(n)
 */
public class BSTLevelOrderTraversal {

    // Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

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
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> result = new ArrayList<>();
            //Step1: check null and return
            if (root == null) return result;

            //Step2: You need a queue of TreeNode to add the nodes
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);

            //Step3: Loop over the queue till empty add new nodes
            while (!queue.isEmpty()) {
                int size = queue.size();
                List<Integer> currentLevel = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                    //Step4: for all the elemts in queue add to current level
                    TreeNode current = queue.remove();
                    currentLevel.add(current.val);
                    //Step5: add left and right to queue now
                    if (current.left != null)
                        queue.add(current.left);
                    if (current.right != null)
                        queue.add(current.right);
                }
                //step6: Add each level
                result.add(currentLevel);
            }
            return result;
        }
    }
}
