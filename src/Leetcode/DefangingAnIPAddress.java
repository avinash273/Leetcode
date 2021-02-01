package Leetcode;

public class DefangingAnIPAddress {
    class Solution {
        public String defangIPaddr(String address) {
            StringBuilder sb = new StringBuilder();
            for (char each : address.toCharArray()) {
                if (each == '.')
                    sb.append("[.]");
                else
                    sb.append(each);
            }
            return sb.toString();
        }
    }
}
