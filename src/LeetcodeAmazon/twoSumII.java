package LeetcodeAmazon;

/**
 * T: O(n)
 * S: O(1)
 */

public class twoSumII {
    class Solution {
        public int[] twoSum(int[] numbers, int target) {
            int[] result = new int[2];
            int left = 0;
            int right = numbers.length - 1;

            while (left < right) {
                if (numbers[right] + numbers[left] == target) {
                    result[0] = left + 1;
                    result[1] = right + 1;
                    return result;
                } else if (numbers[right] + numbers[left] > target)
                    right--;
                else
                    left++;
            }
            return result;
        }
    }
}
