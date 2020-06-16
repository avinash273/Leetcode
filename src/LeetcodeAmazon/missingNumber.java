package LeetcodeAmazon;

import java.util.HashSet;

/**
 * T: O(n)
 * S: O(n)
 */

public class missingNumber {
    class Solution {
        public int missingNumber(int[] nums) {
            HashSet<Integer> set = new HashSet<Integer>();

            for(int each:nums){
                set.add(each);
            }

            for (int i = 0; i <= nums.length; i++){
                if(!set.contains(i))
                    return i;
            }
            return -1;
        }
    }
}
