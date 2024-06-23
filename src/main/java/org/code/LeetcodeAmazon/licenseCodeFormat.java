package org.code.LeetcodeAmazon;

/**
 * T: O(n)
 * S: O(1)
 * my own solution good job
 */
public class licenseCodeFormat {

    class AviSolution {
        public String licenseKeyFormatting(String S, int K) {
            int len = S.length();
            if(len == 0 || S == null)
                return S;

            StringBuilder sb = new StringBuilder();

            char[] letters = S.toCharArray();
            int kSet = K;
            for(int i = len - 1; i >= 0; i--){
                if(letters[i] != '-'){
                    sb.insert(0, Character.toUpperCase(letters[i]));
                    if(kSet > 0)
                        kSet--;
                    if(kSet == 0){
                        sb.insert(0, '-');
                        kSet = K;
                    }
                }
            }
            if(sb.length() !=0 && sb.charAt(0) == '-')
                sb.deleteCharAt(0);
            return sb.toString();
        }
    }
}
