package org.code.LeetcodeAmazon;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class deleteNodesReturnForest {

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
        public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
            List<TreeNode> remains = new ArrayList<>();
            Set<Integer> toDelete = new HashSet<>();

            for (int i : to_delete)
                toDelete.add(i);

            removeNodes(root, toDelete, remains);
            if (!toDelete.contains(root.val)) {
                remains.add(root);
            }
            return remains;
        }

        private TreeNode removeNodes(TreeNode root, Set<Integer> toDelete, List<TreeNode> remaining) {
            if (root == null)
                return null;

            root.left = removeNodes(root.left, toDelete, remaining);
            root.right = removeNodes(root.right, toDelete, remaining);

            if (toDelete.contains(root.val)) {
                if (root.left != null)
                    remaining.add(root.left);
                if (root.right != null)
                    remaining.add(root.right);
                return null;
            }
            return root;
        }
    }
}
