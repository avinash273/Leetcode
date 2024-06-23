package org.code.Leetcode2024;

import java.util.HashMap;

public class isAnagram242 {
    public boolean isAnagramSol1(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Integer, Integer> map = new HashMap<>();

        s.chars().forEach(ch -> map.put(ch, (map.getOrDefault(ch, 0)) + 1));
        t.chars().forEach(ch -> map.put(ch, (map.getOrDefault(ch, 0)) - 1));

        return map.values()
                .parallelStream()
                .allMatch(v -> v == 0);
    }

    public boolean isAnagramSol2(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        int[] charMap = new int[26];

        if(sLen != tLen) return false;

        for(int i = 0; i < sLen; i++){
            charMap[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < tLen; i++){
            charMap[t.charAt(i) - 'a']--;
            if(charMap[t.charAt(i)  - 'a'] < 0) return false;
        }
        return true;
    }
}
