package org.code.Leetcode2024;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate217 {
    public boolean containsDuplicateStream(int[] nums) {
        return Arrays.stream(nums).distinct().count() != nums.length;
    }
    public boolean containsDuplicateSet(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            if(!set.contains(num)){
                set.add(num);
            }
            else return true;
        }
        return false;
    }
}
