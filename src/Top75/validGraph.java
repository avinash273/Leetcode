package Top75;

import java.util.*;

public class validGraph {
    class Solution1 {
        public boolean validTree(int n, int[][] edges) {

            List<List<Integer>> adjacencyList = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                adjacencyList.add(new ArrayList<>());
            }
            for (int[] edge : edges) {
                adjacencyList.get(edge[0]).add(edge[1]);
                adjacencyList.get(edge[1]).add(edge[0]);
            }

            Map<Integer, Integer> parent = new HashMap<>();
            parent.put(0, -1);
            Stack<Integer> stack = new Stack<>();
            stack.push(0);

            while (!stack.isEmpty()) {
                int node = stack.pop();
                for (int neighbour : adjacencyList.get(node)) {
                    if (parent.get(node) == neighbour) {
                        continue;
                    }
                    if (parent.containsKey(neighbour)) {
                        return false;
                    }
                    stack.push(neighbour);
                    parent.put(neighbour, node);
                }
            }

            return parent.size() == n;
        }
    }
}
