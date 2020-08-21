package PracticeYoutuber.Arrays;

public class MoveZeroes {
    class Solution {
        public void moveZeroes(int[] nums) {
            int zero = 0;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0)
                    nums[zero++] = nums[i];
            }

            for (int i = zero; i < nums.length; i++)
                nums[i] = 0;
        }
    }
}
