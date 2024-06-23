package org.code.LeetcodeAmazon;

/**
 * T: O(1) as integer value is under a constant
 * S: O(1)
 */

public class hammingDistance {
    class Solution {
        public int hammingDistance(int x, int y) {
            int result = 0;
            while(x > 0 || y > 0){
                result += (x % 2) ^ (y % 2);
                x >>= 1;
                y >>= 1;
            }
            return result;
        }
    }
}
