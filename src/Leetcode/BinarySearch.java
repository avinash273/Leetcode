package Leetcode;

public class BinarySearch extends print {

    void doBinarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int mid = 0, index = 0;

        while (left <= right) {
            mid = (left + right) / 2;

            if (arr[mid] == target){
                index = mid;
                break;
            }
            else if (arr[mid] > target)
                right = mid - 1;
            else if (arr[mid] < target)
                left = mid + 1;
        }

        if ( index == -1)
            prints("Not present");
        else
            printn(index);
    }

}
