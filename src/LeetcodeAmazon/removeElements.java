package LeetcodeAmazon;

/**
 * T: O(n)
 * S: O(1)
 */
public class removeElements {
    class Solution {
        public int removeElement(int[] nums, int val) {
            int length = nums.length;
            int left = 0;
            int right = length - 1;

            while (left <= right) {
                if (nums[left] == val) {
                    nums[left] = nums[right];
                    nums[right] = 0;
                    right--;
                    length--;
                } else
                    left++;
            }
            return length;
        }
    }
}
