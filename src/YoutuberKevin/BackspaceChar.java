package YoutuberKevin;

/**
 * T: O(n)
 * S: O(1)
 */
public class BackspaceChar {
    class Solution {
        public boolean backspaceCompare(String S, String T) {
            int i = S.length() - 1;
            int j = T.length() - 1;
            int backS = 0;
            int backT = 0;

            while (i >= 0 || j >= 0) {
                while (i >= 0 && (backS > 0 || S.charAt(i) == '#')) {
                    if (S.charAt(i) == '#')
                        backS++;
                    else
                        backS--;
                    i--;
                }
                char left = i < 0 ? '$' : S.charAt(i);

                while (j >= 0 && (backT > 0 || T.charAt(j) == '#')) {
                    if (T.charAt(j) == '#')
                        backT++;
                    else
                        backT--;
                    j--;
                }
                char right = j < 0 ? '$' : T.charAt(j);

                if (left != right)
                    return false;
                i--;
                j--;
            }
            return true;
        }
    }
}
