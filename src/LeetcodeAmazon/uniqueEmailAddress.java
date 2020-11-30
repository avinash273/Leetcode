package LeetcodeAmazon;

import java.util.HashSet;

/**
 * T: O(n) n -> length of all strings
 * S: O(n)
 */

public class uniqueEmailAddress {
    class Solution {
        public int numUniqueEmails(String[] emails) {
            HashSet<String> uniqueEmails = new HashSet<>();

            for (String email : emails) {
                int domainIndex = email.indexOf("@");
                String domainName = email.substring(domainIndex);
                String localName = email.substring(0, domainIndex);

                if (localName.contains("+")) {
                    int plusIndex = localName.indexOf("+");
                    localName = localName.substring(0, plusIndex);
                }

                localName = localName.replaceAll("\\.", "");
                uniqueEmails.add(localName + domainName);
            }
            return uniqueEmails.size();
        }
    }
}
