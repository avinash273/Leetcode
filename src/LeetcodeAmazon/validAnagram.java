package LeetcodeAmazon;

import java.util.Arrays;

public class validAnagram {
    class Solution1 {
        public boolean isAnagram(String s, String t) {

            if (s.length() != t.length())
                return false;

            char[] sortedS = s.toCharArray();
            char[] sortedT = t.toCharArray();

            Arrays.sort(sortedS);
            Arrays.sort(sortedT);

            String sFinal = new String(sortedS);
            String tFinal = new String(sortedT);

            if (sFinal.equals(tFinal))
                return true;
            else
                return false;

        }
    }
}
