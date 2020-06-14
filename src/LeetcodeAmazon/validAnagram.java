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

    class Solution2 {
        public boolean isAnagram(String s, String t) {
            if(s.length() != t.length())
                return false;

            int[] count = new int[26];

            //doing this on the assumtion that there are only small letter alphabets
            for(int i = 0; i < s.length(); i++){
                count[s.charAt(i) - 'a']++;
                count[t.charAt(i) - 'a']--;
            }


            for(int k: count){
                if(k != 0)
                    return false;
            }

            return true;

        }
    }
}
