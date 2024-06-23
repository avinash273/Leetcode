package org.code.Amazon;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * T: O(n)
 * S: O(n)
 */
public class ThreeSum {
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> res = new LinkedList<>();
            //Step1: sort the array
            Arrays.sort(nums);

            //Step2: loop over all elemnts
            //nums.length -2 as we require 2 numbers
            for (int i = 0; i < nums.length - 2; i++) {
                //Step3: put condition to check next next elements are not same
                if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                    int low = i + 1;
                    int high = nums.length - 1;
                    int sum = 0 - nums[i];

                    //step4: two pointer loop to get the next 2 nos
                    while (low < high) {
                        //step5: check for confition on which side to move the high and low pointer
                        if (nums[low] + nums[high] == sum) {
                            res.add(Arrays.asList(nums[i], nums[low], nums[high]));
                            //check that next elements are not same
                            while (low < high && nums[low] == nums[low + 1]) low++;
                            while (low < high && nums[high] == nums[high - 1]) high--;
                            low++;
                            high--;
                        } else if (nums[low] + nums[high] > sum)
                            high--;
                        else
                            low++;
                    }
                }
            }
            return res;
        }
    }


}
