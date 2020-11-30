package Leetcode;

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */



public class firstBadVersion {

    boolean isBadVersion(int value){
        return true;
    }

    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        int mid = 0;

        while(left < right){
            mid = left + (right - left)/2;

            if(isBadVersion(mid) == true){
                right = mid;
            }
            else
                left = mid + 1;
        }
        return left;
    }
}
