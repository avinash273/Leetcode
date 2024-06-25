package org.code;
import org.code.Leetcode2024.*;

import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Main to run all classes" );

        /**
         * isAnagram
         */
        IsAnagram242 checkAnagram = new IsAnagram242();
        System.out.println(checkAnagram.isAnagramSol1("anagram", "nagaram"));
        System.out.println(checkAnagram.isAnagramSol2("anagram", "nagaram"));

        /**
         * First unique character
         */
        FirstUniqChar387 firstUniqChar387 = new FirstUniqChar387();
        System.out.println(firstUniqChar387.firstUniqChar("avinash"));

        /**
         * Reverse String
         */
        ReverseString344 reverseString344 = new ReverseString344();
        System.out.println(reverseString344.reverseString("avinash"));

        /**
         * Max Profit
         */
        MaxProfit121 maxProfit121 = new MaxProfit121();
        System.out.println(maxProfit121.maxProfit(new int[]{7,1,5,3,6,4}));

        /**
         * containsDuplicate
         */
        ContainsDuplicate217 containsDuplicate = new ContainsDuplicate217();
        System.out.println(containsDuplicate.containsDuplicateStream(new int[]{1, 1, 2, 3, 3, 4}));

        /**
         * Single Number XOR
         */
        SingleNumber136 singleNumber136 = new SingleNumber136();
        System.out.println(singleNumber136.singleNumber(new int[]{1,1,2,3,3}));
        Stack<Character> stack = new Stack<>();

        /**
         * ValidParentheses Stack
         */
        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValid("()[]{}"));

        String name ="avinash";
        System.out.println(new StringBuilder(name).reverse());
        String reverse = Stream.of(name).map(str -> new StringBuilder(str).reverse()).toString();
    }
}
