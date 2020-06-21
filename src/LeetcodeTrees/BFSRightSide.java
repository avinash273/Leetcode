package LeetcodeTrees;

import java.util.*;

public class BFSRightSide {
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
        public List<Integer> rightSideView(TreeNode root) {
            List<List<Integer>> output = new ArrayList<>();
            List<Integer> temp = new ArrayList<Integer>();

            if(root == null)
                return temp;

            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);

            while(!queue.isEmpty()){
                int size = queue.size();
                List<Integer> currentLevel = new ArrayList<Integer>();
                for(int i = 0; i < size; i++){
                    TreeNode current = queue.remove();
                    currentLevel.add(current.val);

                    if(current.left != null)
                        queue.add(current.left);

                    if(current.right != null){
                        queue.add(current.right);
                    }
                }
                output.add(currentLevel);
            }
            for(List<Integer> each : output)
                temp.add(each.get(each.size()-1));
            return temp;
        }
    }
}
