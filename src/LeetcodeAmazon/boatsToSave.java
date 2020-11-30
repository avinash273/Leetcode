package LeetcodeAmazon;

import java.util.Arrays;

/**
 * T: O(n log n) due to sorting
 * S: O(1)
 */
public class boatsToSave {
    class Solution {
        public int numRescueBoats(int[] people, int limit) {
            Arrays.sort(people);
            int numBoats = 0;
            int left = 0;
            int right = people.length - 1;

            while(left <= right){
                if(people[left] + people[right] <= limit){
                    left++;
                    right--;
                }

                else{
                    right--;
                }
                numBoats++;
            }
            return numBoats;
        }
    }
}
