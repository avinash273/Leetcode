package LeetcodeAmazon;

/**
 * T: O(n)
 * S: O(1)
 */

public class minDominoRotation {
    class Solution {
        public int minDominoRotations(int[] A, int[] B) {
            //There are 4 possibilities for this problem
            //means A[0] element must match with All A
            //means B[0] element must match with All A
            int minSwaps = Math.min(numSwaps(A[0], A, B), numSwaps(B[0], A, B));

            //means A[0] element must match with All B
            minSwaps = Math.min(minSwaps, numSwaps(A[0], B, A));

            //means B[0] element must match with All B
            minSwaps = Math.min(minSwaps, numSwaps(B[0], B, A));

            return minSwaps == Integer.MAX_VALUE ? -1 : minSwaps;
        }

        public int numSwaps(int target, int[] A, int[] B) {
            int numSwaps = 0;
            for (int i = 0; i < A.length; i++) {
                if (A[i] != target && B[i] != target)
                    return Integer.MAX_VALUE;
                else if (A[i] != target)
                    numSwaps++;
            }
            return numSwaps;
        }
    }
}
