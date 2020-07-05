package LeetcodeAmazon;

/**
 * T: O(n)
 * S: O(n)
 */

public class SumEvenNumbersAfterQueries {
    class Solution {
        public int[] sumEvenAfterQueries(int[] A, int[][] queries) {

            int[] output = new int[queries.length];

            int eveSum = 0;
            for (int val : A) {
                if (val % 2 == 0)
                    eveSum += val;
            }

            for (int i = 0; i < queries.length; i++) {
                int index = queries[i][1];
                int value = queries[i][0];

                if (A[index] % 2 == 0) {
                    eveSum -= A[index];
                }

                A[index] += value;

                if (A[index] % 2 == 0) {
                    eveSum += A[index];
                }
                output[i] = eveSum;
            }
            return output;
        }
    }
}
