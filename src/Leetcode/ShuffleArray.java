package Leetcode;

public class ShuffleArray {
    class Solution {
        public int[] shuffle(int[] nums, int n) {

            int[] result = new int[2 * n];
            int even = 0;
            int odd = n;

            for (int i = 0; i < 2 * n; i++) {
                if (i % 2 == 0)
                    result[i] = nums[even++];
                else
                    result[i] = nums[odd++];
            }
            return result;
        }
    }
}
