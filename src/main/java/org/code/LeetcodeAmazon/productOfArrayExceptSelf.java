package org.code.LeetcodeAmazon;

/**
 * T: O(n)
 * S: O(1)
 * awesome problem
 */
public class productOfArrayExceptSelf {
    class Solution {
        public int[] productExceptSelf(int[] nums) {
            int len = nums.length;
            int[] toRight = new int[len];
            int[] toLeft = new int[len];

            toRight[0] = 1;
            toLeft[len - 1] = 1;

            for(int i = len - 2; i >= 0; i--){
                toLeft[i] = toLeft[i + 1] * nums[i + 1];
            }

            for(int i = 1; i < len; i++){
                toRight[i] = toRight[i - 1] * nums[i - 1];
            }

            for(int i = 0; i < len; i++)
                toRight[i] *= toLeft[i];
            return toRight;
        }
    }
}
