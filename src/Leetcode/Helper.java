package Leetcode;

public class Helper {

    public static void main(String[] args) {
        System.out.println("Leetcode.Helper function to call all functionalities");
        /*
        //To get GCD
        EuclidGCD EuclidGCD = new EuclidGCD();
        System.out.println("GCD is " + EuclidGCD.getGCD(20, 4));

        //HashMap word count in String
        String sentence = "Hi I am avinash. What is your name again. I said I am avinash shanker. Sorry your name once more, its avinash. Okay!";
        HashMaps HashMaps = new HashMaps();
        System.out.println(HashMaps.wordCount(sentence));

        //Longest substring
        longestSubstring longestSubstring = new longestSubstring();
        longestSubstring.lengthOfLongestSubstring("pwwkew");

        //Leetcode.anagram
        anagram anagram = new anagram();
        anagram.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
         */

        //Binary Search
        BinarySearch BinarySearch = new BinarySearch();
        BinarySearch.doBinarySearch(new int[]{1,2,3,4,5,6,7,8,9},8);
    }
}
