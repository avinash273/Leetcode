package Top75;

import java.util.HashSet;
import java.util.Set;

/**
 * T: O(n^2)
 * S: O(n)
 */
public class longestConsecutive {
    class Solution {
        public int longestConsecutive(int[] nums) {
            Set<Integer> set = new HashSet<>();
            for (int num : nums)
                set.add(num);

            int max = 0;

            for (int n : set) {
                if (!set.contains(n - 1)) {
                    int m = n + 1;
                    while (set.contains(m))
                        m++;

                    max = Math.max(max, m - n);
                }
            }
            return max;
        }
    }
}
