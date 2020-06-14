package LeetcodeAmazon;

/***
 * T: O(n)
 * S: O(1)
 */
public class moveZeros {
    class Solution {
        public void moveZeroes(int[] nums) {
            int k = 0;
            int i = 0;
            while(i < nums.length){
                if(nums[i] != 0){
                    nums[k] = nums[i];
                    k++;
                }
                i++;
            }

            while(k < nums.length){
                nums[k] = 0;
                k++;
            }
        }
    }
}
