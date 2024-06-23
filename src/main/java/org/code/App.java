package org.code;
import org.code.Leetcode2024.isAnagram242;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        /**
         * isAnagram
         */
        isAnagram242 checkAnagram = new isAnagram242();
        System.out.println(checkAnagram.isAnagramSol1("anagram", "nagaram"));
        System.out.println(checkAnagram.isAnagramSol2("anagram", "nagaram"));
    }
}
