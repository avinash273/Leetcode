package org.code.LeetcodeDFS;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/**
 * T: O(n^2)
 * S: O(n)
 */

public class openLockBFS {
    class Solution {
        public int openLock(String[] deadends, String target) {
            HashSet<String> deadEnd = new HashSet(Arrays.asList(deadends));
            HashSet<String> visited = new HashSet<>();

            visited.add("0000");

            Queue<String> queue = new LinkedList();
            queue.add("0000");

            int level = 0;

            while (!queue.isEmpty()) {
                int size = queue.size();
                while (size > 0) {
                    String lockPosition = queue.poll();
                    if (deadEnd.contains(lockPosition)) {
                        size--;
                        continue;
                    }
                    if (lockPosition.equals(target))
                        return level;

                    StringBuilder sb = new StringBuilder(lockPosition);
                    for (int i = 0; i < 4; i++) {
                        char current = sb.charAt(i);
                        String s1 = sb.substring(0, i) + (current == '9' ? 0 : current - '0' + 1) + sb.substring(i + 1);
                        String s2 = sb.substring(0, i) + (current == '0' ? 9 : current - '0' - 1) + sb.substring(i + 1);

                        if (!visited.contains(s1) && !deadEnd.contains(s1)) {
                            queue.add(s1);
                            visited.add(s1);
                        }

                        if (!visited.contains(s2) && !deadEnd.contains(s2)) {
                            queue.add(s2);
                            visited.add(s2);
                        }
                    }
                    size--;
                }
                level++;
            }
            return -1;
        }
    }
}
