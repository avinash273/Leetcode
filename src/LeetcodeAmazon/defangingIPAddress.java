package LeetcodeAmazon;

/**
 * T: O(n)
 * S: O(n)
 */

public class defangingIPAddress {
    class Solution {
        public String defangIPaddr(String address) {
            StringBuilder result = new StringBuilder();
            for(int i = 0; i < address.length(); i++){
                char current = address.charAt(i);

                if(current == '.')
                    result.append("[.]");
                else
                    result.append(current);
            }
            return result.toString();
        }
    }
}
