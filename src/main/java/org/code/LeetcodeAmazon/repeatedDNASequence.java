package org.code.LeetcodeAmazon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * revist again, good problem
 * T: O(n)
 * S: O(n)
 */
public class repeatedDNASequence {
    class Solution {
        public List<String> findRepeatedDnaSequences(String s) {
            List<String> repeatedSubSeq = new ArrayList<>();
            Map<String, Integer> seen = new HashMap<>();

            int i = 0;
            while(i + 10 <= s.length()){
                String subsequence = s.substring(i, i++ + 10);
                seen.put(subsequence, seen.getOrDefault(subsequence, 0) + 1);

                if(seen.get(subsequence) == 2){
                    repeatedSubSeq.add(subsequence);
                }
            }
            return repeatedSubSeq;
        }
    }
}
