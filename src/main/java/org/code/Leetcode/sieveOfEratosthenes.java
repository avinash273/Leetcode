package org.code.Leetcode;

import java.util.Arrays;

class sieveOfEratosthenes {
    public int countPrimes(int n) {

        int[] isPrime = new int[n];
        Arrays.fill(isPrime, 1);

        int countPrime = 0;

        if (n < 3)
            return 0;
        int i = 2;
        isPrime[0] = 0;
        isPrime[1] = 0;

        while (i < n) {
            for (int j = 2; j < n; j++) {
                if (isPrime[j] == 1) {
                    if (i != j && j % i == 0) {
                        isPrime[j] = 0;
                    }
                }
            }
            i++;
        }

        System.out.println(Arrays.toString(isPrime));

        for (int k = 0; k < n; k++) {
            if (isPrime[k] == 1)
                countPrime++;
        }
        return countPrime;
    }
}
