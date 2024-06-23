package org.code.LeetcodeAmazon;

/**
 * T: O(log n)
 * S: O(1)
 */
public class peakIndexBinary {
    class Solution {
        public int peakIndexInMountainArray(int[] A) {
            int left = 0;
            int right = A.length - 1;

            while (left < right) {
                int mid = left + (right - left) / 2;
                if (A[mid] < A[mid + 1])
                    left = mid + 1;
                else
                    right = mid;
            }
            return left;
        }
    }
}
