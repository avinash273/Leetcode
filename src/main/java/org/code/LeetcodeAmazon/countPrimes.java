package org.code.LeetcodeAmazon;

/**
 * T: O(n^2)
 * S: O(n)
 */
public class countPrimes {
    class Solution {
        public int countPrimes(int n) {
            boolean[] primes = new boolean[n];

            for(int i = 2; i * i < n; i++){
                if(!primes[i]){
                    for(int j = i; j * i < primes.length; j++){
                        primes[i * j] = true;
                    }
                }
            }
            int count = 0;
            for(int i = 2; i < n; i++){
                if(!primes[i])
                    count++;
            }
            return count;
        }
    }
}
