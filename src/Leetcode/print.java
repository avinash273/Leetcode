package Leetcode;

import java.util.Arrays;

/**
 * Got bored of writing the full print statement
 * so, just made this static class
 */
public class print {
    static void print(int value){
        System.out.println(value);
    }

    static void print(String str){
        System.out.println(str);
    }

    static void print(String str, int value){
        System.out.println(str+" "+value);
    }

    static void print(String str, int value, String str2){
        System.out.println(str+" "+value+" "+str2);
    }

    static void print(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
}
