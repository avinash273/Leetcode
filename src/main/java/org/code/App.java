package org.code;
import org.code.Leetcode2024.*;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Main to run all classes" );

        /**
         * isAnagram
         */
        isAnagram242 checkAnagram = new isAnagram242();
        System.out.println(checkAnagram.isAnagramSol1("anagram", "nagaram"));
        System.out.println(checkAnagram.isAnagramSol2("anagram", "nagaram"));

        /**
         * First unique character
         */
        firstUniqChar387 firstUniqChar387 = new firstUniqChar387();
        System.out.println(firstUniqChar387.firstUniqChar("avinash"));

        /**
         * Reverse String
         */
        reverseString344 reverseString344 = new reverseString344();
        System.out.println(reverseString344.reverseString("avinash"));

        /**
         * Max Profit
         */
        maxProfit121 maxProfit121 = new maxProfit121();
        System.out.println(maxProfit121.maxProfit(new int[]{7,1,5,3,6,4}));

        /**
         * containsDuplicate
         */
        containsDuplicate217 containsDuplicate = new containsDuplicate217();
        System.out.println(containsDuplicate.containsDuplicateStream(new int[]{1, 1, 2, 3, 3, 4}));

        /**
         * Single Number XOR
         */
        singleNumber136 singleNumber136 = new singleNumber136();
        System.out.println(singleNumber136.singleNumber(new int[]{1,1,2,3,3}));
    }
}
