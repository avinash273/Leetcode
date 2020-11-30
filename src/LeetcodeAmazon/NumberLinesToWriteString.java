package LeetcodeAmazon;

/**
 * T: O(n)
 * S: O(1)
 */
public class NumberLinesToWriteString {
    class Solution {
        public int[] numberOfLines(int[] widths, String S) {
            int[] result = new int[2];
            int numLines = 1;
            int width = 0;


            for (char c : S.toCharArray()) {
                int charWidth = widths[c - 'a'];
                if (charWidth + width > 100) {
                    numLines++;
                    width = 0;
                }
                width += charWidth;
            }
            result[0] = numLines;
            result[1] = width;
            return result;
        }
    }
}
