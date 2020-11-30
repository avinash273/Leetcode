package LeetcodeAmazon;

/**
 * T: O(n + m)
 * S: O(1)
 */
public class longPressed {
    class Solution {
        public boolean isLongPressedName(String name, String typed) {
            if (name.length() == typed.length())
                return true;

            if (name.length() > typed.length())
                return false;

            int i = 0;
            int j = 0;

            while (j < typed.length()) {
                if (i < name.length() && name.charAt(i) == typed.charAt(j))
                    i++;
                else if (j == 0 || typed.charAt(j) != typed.charAt(j - 1))
                    return false;
                j++;
            }
            return i == name.length();
        }
    }
}
