package org.code.prep;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class mostCommonWord {
    class Solution {
        public String mostCommonWord(String paragraph, String[] banned) {
            Set<String> banset = new HashSet<>();
            for (String word : banned)
                banset.add(word);
            banset.add("");

            HashMap<String, Integer> map = new HashMap<>();
            int maxCount = 0;
            String most = "";

            for (String word : paragraph.replaceAll("[^a-zA-Z]", " ").toLowerCase().split(" ")) {
                if (!banset.contains(word)) {
                    map.put(word, map.getOrDefault(word, 0) + 1);
                    if (maxCount < map.get(word)) {
                        maxCount = map.get(word);
                        most = word;
                    }
                }
            }
            return most;
        }
    }
}
