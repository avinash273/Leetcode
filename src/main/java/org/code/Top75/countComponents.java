package org.code.Top75;

import java.util.ArrayList;
import java.util.List;

public class countComponents {
    class Solution {
        public int countComponents(int n, int[][] edges) {
            List<List<Integer>> graph = new ArrayList<>();
            for (int i = 0; i < n; i++)
                graph.add(new ArrayList<>());

            for (int[] edge : edges) {
                graph.get(edge[0]).add(edge[1]);
                graph.get(edge[1]).add(edge[0]);
            }

            int components = 0;
            boolean[] visited = new boolean[n];

            for (int i = 0; i < n; i++) {
                components += dfs(graph, i, visited);
            }
            return components;
        }

        private int dfs(List<List<Integer>> graph, int i, boolean[] visited) {
            if (visited[i]) return 0;
            visited[i] = true;

            for (int node : graph.get(i))
                dfs(graph, node, visited);
            return 1;
        }
    }


}
