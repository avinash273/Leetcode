package LeetcodeTrees;

/**
 * T: O(1)
 * S: O(1)
 */

public class palindromeNumber {
    class Solution {
        public boolean isPalindrome(int x) {
            int temp = x;
            if( x == 0)
                return true;
            if(x < 0)
                return false;

            int reversed = 0;

            while(x != 0){
                int ones = x % 10;
                reversed = reversed * 10 + ones;
                x = x / 10;
            }

            return temp == reversed;
        }
    }
}
