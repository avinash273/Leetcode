package Leetcode;
import java.util.*;

class longestRepeatingSubstring {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int size = s.length();
        int left = 0, right = 0;
        int ans = 0;

        while(left < size && right < size){
            if(map.containsKey(s.charAt(right)))
                left = Math.max(left, map.get(s.charAt(right))+1);
            ans = Math.max(ans, right - left +1);
            map.put(s.charAt(right), right);
            right++;
        }
        return ans;
    }
}

