package Leetcode;

import java.util.*;

class majorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        int maxCount = 0;
        int maxElement = 0;

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else
                map.put(num, 1);
        }

        for (Map.Entry m : map.entrySet()) {
            if ((Integer) m.getValue() > maxCount) {
                maxElement = (Integer) m.getKey();
                maxCount = (Integer) m.getValue();
            }
        }
        return maxElement;
    }
}
