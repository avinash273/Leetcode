package org.code.LeetcodeAmazon;

public class fibonacci {
    /**
     * T: O(2^n)
     * S: O(n)
     */
    class Solution {
        public int fib(int N) {
            //O(2^n)
            if (N == 0)
                return 0;
            if (N == 1)
                return 1;
            return fib(N - 1) + fib(N - 2);
        }
    }
}
