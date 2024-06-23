package org.code.Amazon;

import java.util.Arrays;

/**
 * Let N be the number of logs in the list and
 * M be the maximum length of a single log.
 * T: O(mn log n)
 * S: O(m log n)
 */
public class ReorderLogFiles {
    class Solution {
        public String[] reorderLogFiles(String[] logs) {
            Arrays.sort(logs, (log1, log2) -> {
                //log1 < log2 -> -1
                //log1 == log2 -> 0
                //log1 > log2 -> 1

                int index1 = log1.indexOf(" ");
                String id1 = log1.substring(0, index1);
                String main1 = log1.substring(index1 + 1);

                int index2 = log2.indexOf(" ");
                String id2 = log2.substring(0, index2);
                String main2 = log2.substring(index2 + 1);

                boolean isDigit1 = Character.isDigit(main1.charAt(0));
                boolean isDigit2 = Character.isDigit(main2.charAt(0));

                if (!isDigit1 && !isDigit2) {
                    int value = main1.compareTo(main2);
                    if (value == 0) return id1.compareTo(id2);
                    return value;
                }
                return isDigit1 ? (isDigit2 ? 0 : 1) : -1;

            });
            return logs;
        }
    }
}
