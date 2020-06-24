package LeetcodeAmazon;

/**
 * T: O(mn)
 * S: O(1)
 */

public class longestCommonPrefix {
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            String longestCommonPrefix = "";
            if(strs == null || strs.length == 0)
                return longestCommonPrefix;

            int index = 0;
            for(char c: strs[0].toCharArray()){
                for(int i = 1; i < strs.length; i++){
                    if(index >= strs[i].length() || c != strs[i].charAt(index))
                        return longestCommonPrefix;
                }
                longestCommonPrefix += c;
                index++;
            }
            return longestCommonPrefix;
        }
    }
}
