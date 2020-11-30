package LeetcodeAmazon;

/**
 * T: O(n)
 * S: O(1)
 */
public class lemonadeChange {
    class Solution {
        public boolean lemonadeChange(int[] bills) {
            int fives = 0;
            int tens = 0;

            for (int bill : bills) {
                if (bill == 5) {
                    fives++;
                } else if (bill == 10) {
                    tens++;
                    fives--;
                } else if (bill == 20 && tens > 0) {
                    tens--;
                    fives--;
                } else if (bill == 20) {
                    fives -= 3;
                }

                if (fives < 0 || tens < 0)
                    return false;
            }
            return true;
        }
    }
}
