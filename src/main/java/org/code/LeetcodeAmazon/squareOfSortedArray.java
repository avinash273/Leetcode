package org.code.LeetcodeAmazon;

import java.util.Arrays;

public class squareOfSortedArray {
    /**
     * T: O(n)
     * S: O(n)
     */
    class Solution {
        public int[] sortedSquares(int[] A) {
            int[] result = new int[A.length];

            if (A == null || A.length == 0)
                return result;

            int left = 0;
            int right = A.length - 1;

            int index = A.length - 1;
            while (left <= right) {
                if ((A[left] * A[left]) > (A[right] * A[right])) {
                    result[index--] = A[left] * A[left];
                    left++;
                } else {
                    result[index--] = A[right] * A[right];
                    right--;
                }
            }
            return result;
        }
    }

    /**
     * T: O(n log n)
     * S: O(1)
     */
    class Solution2 {
        public int[] sortedSquares(int[] A) {
            for (int i = 0; i < A.length; i++) {
                A[i] = A[i] * A[i];
            }
            Arrays.sort(A);
            return A;
        }
    }
}
