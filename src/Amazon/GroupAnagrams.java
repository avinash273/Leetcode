package Amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * T: O(n K log K) -> (k log k ) is for sorting and n times for each word
 * S O(nk)
 * n -> words in str array
 * k -> max size of words
 */
public class GroupAnagrams {
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            HashMap<String, List<String>> map = new HashMap<>();
            List<List<String>> result = new ArrayList<>();
            char[] word;

            for (String each : strs) {
                word = each.toCharArray();
                Arrays.sort(word);
                String sortWord = String.valueOf(word);
                if (!map.containsKey(sortWord)) {
                    map.put(sortWord, new ArrayList<String>());
                    map.get(sortWord).add(each);
                } else {
                    map.get(sortWord).add(each);
                }
            }

            return new ArrayList(map.values());
        }
    }

    /**
     * T: O(n k log k)
     * S: O(n)
     *  * n -> words in str array
     *  * k -> max size of words
     */
    class Solution2 {
        public List<List<String>> groupAnagrams(String[] strs) {
            List<List<String>> result = new ArrayList<>();
            HashMap<String, Integer> map = new HashMap<>();

            if(strs == null || strs.length == 0) return result;
            int i = 0;
            for(String each : strs){
                char[] unSortWord =  each.toCharArray();
                Arrays.sort(unSortWord);
                String sortWord = new String(unSortWord);

                if(map.containsKey(sortWord)){
                    result.get(map.get(sortWord)).add(each);
                }
                else{
                    map.put(sortWord, result.size());
                    List<String> current = new ArrayList<>();
                    current.add(each);
                    result.add(current);
                }
            }
            return result;
        }
    }
}
