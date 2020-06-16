package LeetcodeAmazon;

/**
 * T: O(n)
 * S: O(1)
 */
public class removeElement {
    class Solution {
        public int removeElement(int[] nums, int val) {
            int index = 0;
            for(int i : nums){
                if(i != val)
                    nums[index++] = i;
            }
            return index;
        }
    }
}
