package org.code.LeetcodeAmazon;

public class sortArrayByParity {

    /**
     * Best solution, need to revisit again
     * T: O(n)
     * S: O(1)
     */
    class Solution {
        public int[] sortArrayByParity(int[] A) {
            int index = 0;
            for(int i = 0; i < A.length; i++){
                int temp = 0;
                if(A[i] % 2 == 0){
                    temp = A[index];
                    A[index++] = A[i];
                    A[i] = temp;
                }
            }
            return A;
        }
    }


    /**
     * Avi's first solution
     * T: O(n)
     * S: O(n)
     * this should be done oin O(1) space
     */
    class aviSolution {
        public int[] sortArrayByParity(int[] A) {
            int[] output = new int[A.length];

            if(A.length <= 0)
                return output;

            int left = 0;
            int right = A.length - 1;

            int index = 0;
            while(left <= right){
                if(A[index] % 2 == 0)
                    output[left++] = A[index];
                else
                    output[right--] =  A[index];
                index++;
            }
            return output;
        }
    }
}
