package org.code.Leetcode2024;

import java.util.stream.Stream;

public class CheckisPalindrome {
    public boolean isPalindrome(int x) {
        String num = Integer.toString(x);
        System.out.println(x);
        if(num.equals(new StringBuilder(num).reverse().toString())) return true;
        return false;
    }

    public boolean isPalindromeStream(int x) {
        return false;
    }
}
