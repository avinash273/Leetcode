package org.code.Apple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
    class Solution {
        final int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};

        public List<List<String>> groupAnagrams(String[] strs) {
            List<List<String>> result = new ArrayList<>();
            HashMap<Long, List<String>> map = new HashMap<>();

            for (String word : strs) {
                Long key = getKey(word);

                if (!map.containsKey(key)) {
                    map.put(key, new ArrayList<>());
                    map.get(key).add(word);
                } else {
                    map.get(key).add(word);
                }
            }
            for (Long grouped : map.keySet()) {
                result.add(map.get(grouped));
            }
            return result;
        }

        public long getKey(String word) {
            long key = 1;
            for (char each : word.toCharArray()) {
                key *= primes[each - 'a'];
            }
            return key;
        }
    }
}
