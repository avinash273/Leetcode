package org.code.prep;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class reorganizeString {
    class Solution {
        public String reorganizeString(String S) {
            Map<Character, Integer> map = new HashMap<>();
            for (char c : S.toCharArray())
                map.put(c, map.getOrDefault(c, 0) + 1);

            PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

            maxHeap.addAll(map.keySet());

            StringBuilder result = new StringBuilder();
            while (maxHeap.size() > 1) {
                char current = maxHeap.remove();
                char next = maxHeap.remove();
                result.append(current);
                result.append(next);
                map.put(current, map.get(current) - 1);
                map.put(next, map.get(next) - 1);

                if (map.get(current) > 0)
                    maxHeap.add(current);
                if (map.get(next) > 0)
                    maxHeap.add(next);
            }
            if (!maxHeap.isEmpty()) {
                char last = maxHeap.remove();
                if (map.get(last) > 1)
                    return "";
                result.append(last);
            }
            return result.toString();
        }
    }
}
