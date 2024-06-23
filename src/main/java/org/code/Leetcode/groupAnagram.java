package org.code.Leetcode;
import java.util.*;

/**
 * most important contains all u want.
 */

class groupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List> map = new HashMap<String, List>();

        for (String each: strs){
            char[] charStr = each.toCharArray();
            Arrays.sort(charStr);
            String key = Arrays.toString(charStr);

            if(!map.containsKey(key))
                map.put(key, new ArrayList());
            map.get(key).add(each);
        }
        return new ArrayList(map.values());
    }
}