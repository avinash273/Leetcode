package Amazon;

import java.util.ArrayList;
import java.util.List;

/**
 * T: O(n)
 * S: O(1)
 */
public class PartitionLabels {
    class Solution {
        public List<Integer> partitionLabels(String S) {
            List<Integer> partition = new ArrayList<>();
            //Step1: Setup a lastFound char index as 26 letter
            int[] lastFound = new int[26];

            //Step2: Fill the lastFound position for each char
            for (int i = 0; i < S.length(); i++)
                lastFound[S.charAt(i) - 'a'] = i;

            //Step3: Run while loop and find how much we have to expand end boundries
            int i = 0;
            while (i < S.length()) {
                int end = lastFound[S.charAt(i) - 'a'];
                int j = i;
                //Step4: while loop to check from current i to end
                while (j < end) {
                    end = Math.max(end, lastFound[S.charAt(j++) - 'a']);
                }
                partition.add(j - i + 1);
                i = j + 1;
            }
            return partition;
        }
    }
}
