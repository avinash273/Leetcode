package org.code.Leetcode;

import java.util.HashMap;

public class HashMaps {
    HashMap wordCount(String sentence) {
        HashMap<String, Integer> wordCounter = new HashMap<String, Integer>();
        String[] tokens = sentence.split(" ");

        for (String token : tokens) {
            String word = token.toLowerCase();
            if (wordCounter.containsKey(word)) {
                int count = wordCounter.get(word);
                wordCounter.put(word, count + 1);
            } else {
                wordCounter.put(word, 1);
            }

        }
        return wordCounter;
    }
}
