package org.code.prep;

import java.util.HashSet;

public class numUniqueEmails {
    class Solution {
        public int numUniqueEmails(String[] emails) {
            HashSet<String> set = new HashSet<>();
            for (String email : emails) {
                StringBuilder address = new StringBuilder();
                for (int i = 0; i < email.length(); i++) {
                    char c = email.charAt(i);
                    if (c == '.') continue;
                    else if (c == '+') {
                        while (email.charAt(i) != '@') i++;
                        address.append(email.substring(i + 1));
                    } else {
                        address.append(c);
                    }
                }
                set.add(address.toString());
            }
            return set.size();
        }
    }
}
