package Leetcode;

import java.util.HashMap;

public class longestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 1)
            return 1;
        else if (s.length() == 0)
            return 0;
        char[] tokens = s.toCharArray();
        HashMap<Character, Integer> storeChar = new HashMap<>();
        int counter = 0, i = 0, j = 0, max_val = 0;
        int strLen = tokens.length;
        while (i < strLen) {
            if (storeChar.containsKey(tokens[i])) {
                i = storeChar.get(tokens[i]) + 1;
                storeChar.clear();
                counter = 0;
            } else {
                storeChar.put(tokens[i], i);
                counter++;
                max_val = Math.max(counter, max_val);
                i++;
            }

        }
        System.out.println(storeChar);
        System.out.println(max_val);
        return max_val;
    }
}


