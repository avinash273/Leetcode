package org.code.Amazon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * T: O(m+n)
 * S: O(m+n)
 * N be the number of characters in the input string and
 * M be the number of characters in the banned list.
 */
public class MostCommonWord {
    class Solution {
        public String mostCommonWord(String paragraph, String[] banned) {
            String[] words = paragraph.toLowerCase().split("\\W+");
            Set<String> ban = new HashSet<>(Arrays.asList(banned));
            HashMap<String, Integer> map = new HashMap<>();

            for (String word : words) {
                if (!ban.contains(word))
                    map.put(word, map.getOrDefault(word, 0) + 1);
            }

            int max = 0;
            String mostCommon = "";

            for (String word : map.keySet()) {
                max = Math.max(max, map.get(word));
                if (map.get(word) >= max)
                    mostCommon = word;
            }
            return mostCommon;
        }
    }
}
