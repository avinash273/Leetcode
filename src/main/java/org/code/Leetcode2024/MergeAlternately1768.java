package org.code.Leetcode2024;

public class MergeAlternately1768 {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        StringBuilder sb = new StringBuilder();
        char[] str1 = word1.toCharArray();
        char[] str2 = word2.toCharArray();
        int i = 0;
        int j = 0;

        while (i < len1 || j < len2) {
            if (i < len1 && j < len2) {
                sb.append(str1[i++]);
                sb.append(str2[j++]);
            } else if (i >= len1 && j < len2) {
                sb.append(str2[j++]);
            } else if (i < len1 && j >= len2) {
                sb.append(str1[i++]);
            }
        }

        return sb.toString();
    }
}
