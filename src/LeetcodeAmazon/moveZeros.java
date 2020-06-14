package LeetcodeAmazon;

/**
 * T: O(n)
 * S: O(1)
 */
public class moveZeros {
    class Solution {
        public void moveZeroes(int[] nums) {
            int len = nums.length;
            int[] temp = nums;

            int k = 0;
            int i = 0;
            while(i < len){
                if(nums[i] != 0){
                    nums[k] = nums[i];
                    k++;
                }
                i++;
            }

            while(k < len){
                nums[k] = 0;
                k++;
            }
        }
    }
}
