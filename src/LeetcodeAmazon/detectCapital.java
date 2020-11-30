package LeetcodeAmazon;

/**
 * T: O(n) where n = letter count
 * S: (1)
 * https://leetcode.com/problems/detect-capital/submissions/
 */

public class detectCapital {
    class Solution {
        public boolean detectCapitalUse(String word) {
            int len = word.length();
            if (len == 0 || word == null)
                return true;

            int allCap = 0;
            int firstCap = 0;
            int noCap = 0;

            for (int i = 0; i < len; i++) {
                if (Character.isUpperCase(word.charAt(i)))
                    allCap++;

                if (!Character.isUpperCase(word.charAt(i)))
                    noCap++;

                if (Character.isUpperCase(word.charAt(0)) && !Character.isUpperCase(word.charAt(i)) && i != 0)
                    firstCap++;
            }
            System.out.println("allCap:" + allCap + " noCap:" + noCap + " firstCap:" + firstCap + " len" + len);
            if (allCap == len || noCap == len || firstCap == len - 1)
                return true;
            return false;
        }
    }

    /**
     * better version, more professional
     */
    class Solution2 {
        public boolean detectCapitalUse(String word) {
            int len = word.length();
            int allCap = 0;
            int firstCap = 0;
            int noCap = 0;

            for (int i = 0; i < len; i++) {
                if (Character.isUpperCase(word.charAt(i)))
                    allCap++;

                if (!Character.isUpperCase(word.charAt(i)))
                    noCap++;

                if (Character.isUpperCase(word.charAt(0)) && !Character.isUpperCase(word.charAt(i)) && i != 0)
                    firstCap++;
            }

            return (allCap == len || noCap == len || firstCap == len - 1);
        }
    }
}
