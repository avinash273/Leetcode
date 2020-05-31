package Leetcode;

import java.util.HashSet;
import java.util.Set;

class duplicatesHashSet {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();

        for(int num: nums){
            set.add(num);
        }
        int lenSet = set.size();
        int lenArr = nums.length;

        if(lenSet != lenArr)
            return true;
        else
            return false;
    }
}
