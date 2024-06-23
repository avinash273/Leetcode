package org.code.LeetcodeAmazon;

import java.util.HashSet;

/**
 * teaches you how to sum number 123 = 6
 * T: O(log n)
 * S: O(log n)
 */

public class happyNumber {
    class Solution {
        public boolean isHappy(int n) {
            if(n <= 0)
                return false;

            HashSet<Integer> seen = new HashSet<Integer>();

            while(n != 1){
                int current = n;
                int sum = 0;

                while(current != 0){
                    sum += (current % 10) * (current % 10);
                    current /= 10;
                }

                if(seen.contains(sum))
                    return false;

                seen.add(sum);
                n = sum;
            }
            return true;
        }
    }
}
