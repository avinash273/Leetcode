package LeetcodeAmazon;

/**
 * https://leetcode.com/problems/shortest-way-to-form-string/submissions/
 * T: (m*n)
 * S: (m)
 */

public class shortestWayFromSubstring {
    class Solution {
        public int shortestWay(String source, String target) {
            int numSubsequences = 0;
            String remaining = target;

            while (remaining.length() > 0) {
                StringBuilder subseq = new StringBuilder();
                int i = 0;
                int j = 0;
                while (i < source.length() && j < remaining.length()) {
                    if (source.charAt(i++) == remaining.charAt(j)) {
                        subseq.append(remaining.charAt(j++));
                    }
                }
                if (subseq.length() == 0)
                    return -1;
                numSubsequences++;
                remaining = remaining.substring(subseq.length());
            }
            return numSubsequences;
        }
    }
}
