package org.code.Leetcode;

import java.util.Arrays;

/**
 * Number boats required to save people
 * max boat weight is given, people weight is given in array
 */

public class saveBoats {
    int saveBoats(int[] arr, int limit) {
        Arrays.sort(arr);
        int boatCount = 0;
        int size = arr.length;
        int left = 0, right = size-1;

        while (left <= right) {
            int balance = 0;
            if (left == right) {
                boatCount++;
                left++;
            }
            else if (arr[right] == limit) {
                boatCount++;
                right--;
            } else if (arr[right] < limit) {
                balance = limit - arr[right];
                if (arr[left] <= balance)
                    left++;
                right--;
                boatCount++;
            }
        }
        return boatCount;
    }
}
