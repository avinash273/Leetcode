package org.code.LeetcodeAmazon;

import java.util.HashMap;
import java.util.PriorityQueue;

public class reOrganizeString {
    /*
T: O(n log n) -> as we are using max heap
S: O(n) -> for the string builder HashMap will be max of O(26)
*/
    class Solution {
        public String reorganizeString(String S) {
            HashMap<Character, Integer> counts = new HashMap<>();

            for(char each: S.toCharArray())
                counts.put(each, counts.getOrDefault(each, 0) + 1);

            PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> counts.get(b) - counts.get(a));
            maxHeap.addAll(counts.keySet());

            StringBuilder sb = new StringBuilder();
            while(maxHeap.size() > 1){
                char current = maxHeap.remove();
                char next = maxHeap.remove();
                sb.append(current);
                sb.append(next);

                counts.put(current, counts.get(current) - 1);
                counts.put(next, counts.get(next) - 1);

                if(counts.get(current) > 0)
                    maxHeap.add(current);

                if(counts.get(next) > 0)
                    maxHeap.add(next);
            }

            if(maxHeap.size() > 0){
                char last = maxHeap.remove();
                if(counts.get(last) > 1)
                    return "";
                else
                    sb.append(last);
            }

            return sb.toString();
        }
    }
}
