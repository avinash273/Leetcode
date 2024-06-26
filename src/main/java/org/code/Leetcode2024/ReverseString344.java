package org.code.Leetcode2024;

public class ReverseString344 {
    public String reverseString(String string) {
        char[] s = string.toCharArray();
        int left = 0;
        int right = s.length - 1;
        char temp;

        while(left < (s.length/2)){
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        return new String(s);
    }
}
