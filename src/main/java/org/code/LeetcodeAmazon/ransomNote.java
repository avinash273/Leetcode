package org.code.LeetcodeAmazon;

import java.util.HashMap;

/**
 * T: O(n) n -> magazine
 * S: O(m) m -> magazine
 */

public class ransomNote {
    class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {
            HashMap<Character, Integer> ransomMap = new HashMap<>();

            for(char each: magazine.toCharArray())
                ransomMap.put(each, ransomMap.getOrDefault(each, 0) + 1);

            for(char each: ransomNote.toCharArray()){
                if(ransomMap.containsKey(each) && ransomMap.get(each) >= 1){
                    ransomMap.put(each, ransomMap.get(each) - 1);
                }
                else
                    return false;
            }
            return true;
        }
    }
}
