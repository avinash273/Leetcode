package org.code.Amazon;

import java.util.Arrays;

public class MedianTwoSortedArrays {

    /**
     * T: O(log(min(m,n)))
     * S: O(1)
     */
    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            if (nums1.length > nums2.length)
                return findMedianSortedArrays(nums2, nums1);

            int x = nums1.length;
            int y = nums2.length;

            int left = 0;
            int right = x;

            while (left <= right) {
                int partitionX = (left + right) / 2;
                int partitionY = (x + y + 1) / 2 - partitionX;

                int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
                int minRightX = (partitionX == x) ? Integer.MAX_VALUE : nums1[partitionX];

                int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
                int minRightY = (partitionY == y) ? Integer.MAX_VALUE : nums2[partitionY];

                if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
                    if ((x + y) % 2 == 0)
                        return (Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2.0;
                    else
                        return Math.max(maxLeftX, maxLeftY);
                } else if (maxLeftX > minRightY)
                    right = partitionX - 1;
                else
                    left = partitionX + 1;

            }
            return 0.0;
        }
    }

    /**
     * T: O(m+n)
     * S: O(m+n)
     */
    class Solution_brute_force {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int total = nums1.length + nums2.length;
            int both[] = new int[total];
            double result = 0;

            int i = 0;
            int j = 0;
            int k = 0;

            while (i < nums1.length && j < nums2.length) {
                if (nums1[i] < nums2[j])
                    both[k++] = nums1[i++];
                else
                    both[k++] = nums2[j++];
            }

            if (i < nums1.length) {
                while (i < nums1.length) {
                    both[k++] = nums1[i++];
                }
            } else if (j < nums2.length) {
                while (j < nums2.length) {
                    both[k++] = nums2[j++];
                }
            }

            System.out.println(Arrays.toString(both));

            int mid = total / 2;

            result = (total % 2 == 0) ? (both[mid] + both[mid - 1]) / 2.0 : both[mid];

            return result;
        }
    }
}
