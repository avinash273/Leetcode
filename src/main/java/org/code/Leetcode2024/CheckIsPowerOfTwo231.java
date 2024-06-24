package org.code.Leetcode2024;

public class CheckIsPowerOfTwo231 {
    public boolean isPowerOfTwoLogN(int n) {
        long power = 1;
        while(power < n){
            power *= 2;
        }
        return (power == n);
    }
    public boolean isPowerOfTwoConstantTime(int n) {
        /**The idea behind binary of power of 2 is all 0 bits with just 1 one bit.
         x & (-x) == x then power of 2
         -x = !x + 1
         */
        long x = n;
        if(n == 0)return false;
        return (x & (-x)) == x;

    }
}
