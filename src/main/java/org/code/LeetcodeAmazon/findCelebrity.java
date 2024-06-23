package org.code.LeetcodeAmazon;

/**
 * T: O(n)
 * S: O(1)
 */
public class findCelebrity {
    /* The knows API is defined in the parent class Relation. */
      boolean knows(int a, int b){
          return false;
      }

    public class Solution {
        public int findCelebrity(int n) {

            int candidate = 0;
            for(int i = 1; i < n; i++){
                if(knows(candidate, i)){
                    candidate = i;
                }
            }

            for(int j = 0; j < n; j++){
                if( candidate != j && knows(candidate,j) || !knows(j, candidate))
                    return -1;
            }
            return candidate;
        }
    }
}
