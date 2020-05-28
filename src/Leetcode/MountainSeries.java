package Leetcode;

/***
 * To check if given array is a valid mountain series or not
 *
 */
public class MountainSeries {
    boolean implementMountainSeries(int[] A){
        int size = A.length;
        int i = 1;
        int increase = 0, decrease = 0;

        if(size <= 2)
            return false;

        while( i < size && A[i] > A[i-1]){
            i++;
        }

        if( i == size || i == 1)
            return false;
        else if (i < size){
            while(i < size && A[i] < A[i-1])
                i++;
            if( i == size)
                return true;
        }
        return false;
    }
}
