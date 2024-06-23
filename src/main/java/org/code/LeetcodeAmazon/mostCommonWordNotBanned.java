package org.code.LeetcodeAmazon;

import java.util.HashMap;
import java.util.HashSet;

/**
 * T: O(paragraph + banned)
 * S: O(banned)
 */
public class mostCommonWordNotBanned {
    class Solution {
        public String mostCommonWord(String paragraph, String[] banned) {
            HashSet<String> banSet = new HashSet<>();

            for (String word : banned)
                banSet.add(word.toLowerCase());

            HashMap<String, Integer> map = new HashMap<>();
            String[] goodString = paragraph.toLowerCase().split("\\W+");

            for (String word : goodString) {
                if (!banSet.contains(word))
                    map.put(word, map.getOrDefault(word, 0) + 1);
            }

            int maxCount = 0;
            String result = "";

            for (String key : map.keySet()) {
                if (maxCount < map.get(key)) {
                    maxCount = map.get(key);
                    result = key;
                }
            }

            return result;

        }
    }
}
