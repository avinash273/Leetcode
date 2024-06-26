package org.code.LeetcodeAmazon;

/**
 * T: O(1)
 * S: O(1)
 */
public class RectangleOverlap {
    class Solution {
        public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
            return rec1[0] < rec2[2] && rec1[1] < rec2[3] && rec2[0] < rec1[2] && rec2[1] < rec1[3];
        }
    }
}
