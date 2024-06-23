package org.code.Leetcode;

import java.util.HashMap;

class sum4toZero {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int ans = 0;
        int size = A.length;

        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                int sumAB = A[i] + B[j];
                if (map.containsKey(sumAB))
                    map.put(sumAB, map.get(sumAB) + 1);
                else
                    map.put(sumAB, 1);
            }
        }

        System.out.println(map);

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int target = -(C[i] + D[j]);
                if (map.containsKey(target))
                    ans += map.get(target);
            }
        }
        return ans;
    }
}