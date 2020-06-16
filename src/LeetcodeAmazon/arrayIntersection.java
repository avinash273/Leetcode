package LeetcodeAmazon;

import java.util.HashSet;

/**
 * T: O(n)+O(m)
 * S: O(m+n)
 */

public class arrayIntersection {
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            HashSet<Integer> set = new HashSet<Integer>();
            for(int each:nums1){
                set.add(each);
            }

            HashSet<Integer> intersection = new HashSet<Integer>();
            for(int each: nums2){
                if(set.contains(each))
                    intersection.add(each);
            }

            int i = 0;
            int[] output = new int[intersection.size()];
            for(int each:intersection){
                output[i] = each;
                i++;
            }
            return output;
        }
    }
}
