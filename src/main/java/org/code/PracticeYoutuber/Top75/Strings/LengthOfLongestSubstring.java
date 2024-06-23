package org.code.PracticeYoutuber.Top75.Strings;

import java.util.HashSet;

/**
 * T: O(n^2)
 * S: O(1)
 */
public class LengthOfLongestSubstring {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            HashSet<Character> set = new HashSet();

            int count = 0;
            int maxCount = 0;
            int i = 0;

            while( i < s.length()){
                if(!set.contains(s.charAt(i))){
                    set.add(s.charAt(i));
                    count++;
                }
                else{
                    maxCount = Math.max(count, maxCount);
                    count = 0;
                    i -= set.size();
                    set.clear();
                }
                i++;
            }
            return Math.max(count, maxCount);
        }
    }
}
