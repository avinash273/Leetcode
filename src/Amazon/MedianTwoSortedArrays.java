package Amazon;

import java.util.Arrays;

public class MedianTwoSortedArrays {
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
