package org.code.LeetcodeAmazon;

/**
 * T: O(n)
 * S: O(1)
 * simple and elegant need to do again
 * https://leetcode.com/problems/monotonic-array/submissions/
 */
public class montonicArray {
    class Solution {
        public boolean isMonotonic(int[] A) {
            boolean increasing = true;
            boolean decreasing =  true;

            for(int i = 0; i < A.length - 1; i++){
                if(A[i] > A[i + 1]){
                    increasing = false;
                }
                if(A[i] < A[i + 1]){
                    decreasing = false;
                }
            }
            return increasing || decreasing;
        }
    }
}
