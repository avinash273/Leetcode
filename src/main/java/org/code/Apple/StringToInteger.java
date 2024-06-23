package org.code.Apple;

public class StringToInteger {
    class Solution {
        public int myAtoi(String s) {
            int i = 0;
            int sign = 1;
            int result = 0;
            if (s.length() == 0) return 0;

            //if you find space in the begining only, then just move
            while (i < s.length() && s.charAt(i) == ' ') i++;

            //find if the number is negative or positive
            if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-'))
                sign = (s.charAt(i++) == '-') ? -1 : 1;

            //process inside this loop only when its a valid number
            while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                //this condition is to check if the values is withing integer bounds
                if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && s.charAt(i) - '0' > Integer.MAX_VALUE % 10)) {
                    return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                result = result * 10 + (s.charAt(i++) - '0');
            }
            return result * sign;
        }
    }
}
