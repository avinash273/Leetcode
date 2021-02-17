package GoldmanSachs;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class HighFive {
    class Solution {
        public int[][] highFive(int[][] items) {
            if (items.length == 0) return items;
            int n = 5;

            TreeMap<Integer, PriorityQueue<Integer>> map = new TreeMap<>();

            //This will give me a sorted map with top 5 scores of each ID
            for (int[] marks : items) {
                int id = marks[0];
                int score = marks[1];

                if (!map.containsKey(id)) {
                    map.put(id, new PriorityQueue<Integer>());
                    map.get(id).add(score);
                } else {
                    map.get(id).add(score);
                    if (map.get(id).size() > n) {
                        map.get(id).poll();
                    }
                }
            }

            //Implement to get the average score for each ID
            List<int[]> result = new ArrayList<>();

            for (int id : map.keySet()) {
                int sum = 0;
                while (map.get(id).size() != 0) {
                    sum += map.get(id).poll();
                }
                result.add(new int[]{id, sum / 5});
            }

            int[][] solutionArray = new int[result.size()][];
            return result.toArray(solutionArray);
        }
    }
}
