package Leetcode;

public class moveZeros {
    int[] moveZeros(int[] arr) {
        int size = arr.length;
        int j = 0;
        for (int i =0; i<size; i++){
            if(arr[i] != 0){
                arr[j] = arr[i];
                j++;
            }
        }

        for (int i=j; i<size; i++)
            arr[i] = 0;


        return arr;
    }
}
