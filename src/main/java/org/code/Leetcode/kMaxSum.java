package org.code.Leetcode;

/**
 * to get the sum of k max elements
 */
public class kMaxSum {
    int maxSum(int[] arr, int k) {
        int maxSum = Integer.MIN_VALUE;
        int windowSum = 0;
        int size = arr.length;
        k = Math.min(k, size);

        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        if (k >= size)
            return windowSum;

        for (int i = 0; i < size - k; i++){
            windowSum = windowSum - arr[i] + arr[k+i];
            maxSum = Math.max(windowSum, maxSum);
        }
            return maxSum;
    }
}
