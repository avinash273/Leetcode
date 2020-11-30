package LeetcodeAmazon;

import java.util.*;

/**
 * T: O(n)
 * S: O(n)
 * The challenge was to do it O(n) O(1) way, but couldn't think of such solution
 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/solution/
 */

public class missingNumbers {
    class Solution {
        public List<Integer> findDisappearedNumbers(int[] nums) {
            Set<Integer> set = new HashSet<Integer>();
            List<Integer> output = new ArrayList<Integer>();

            for(int each:nums)
                set.add(each);

            for(int i = 1; i <= nums.length; i++){
                if(!set.contains(i))
                    output.add(i);
            }
            return output;
        }
    }
}
