package org.code.Top75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupAnagrams {
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            List<List<String>> output = new ArrayList<>();
            HashMap<String, List<String>> map = new HashMap<>();

            for (String word : strs) {
                char[] characters = word.toCharArray();
                Arrays.sort(characters);
                String sortedWord = new String(characters);

                if (!map.containsKey(sortedWord))
                    map.put(sortedWord, new ArrayList<String>());
                map.get(sortedWord).add(word);
            }
            output.addAll(map.values());
            return output;
        }
    }


}
