package org.code.LeetcodeAmazon;


/**
 * T: O(log n)
 * S: O(1)
 */
public class firstBadVersion {
    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
    boolean isBadVersion(int version){
        return true;
    }

    public class Solution  {
        public int firstBadVersion(int n) {
            int left = 0;
            int right = n;

            while(left < right){
                int mid = left + (right - left)/2;
                if(isBadVersion(mid))
                    right = mid;
                else
                    left = mid + 1;
            }
            return left;
        }
    }
}
