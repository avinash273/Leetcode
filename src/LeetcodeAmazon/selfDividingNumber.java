package LeetcodeAmazon;

import java.util.*;

public class selfDividingNumber {
    class Solution {
        public List<Integer> selfDividingNumbers(int left, int right) {
            List<Integer> result = new ArrayList<>();

            for(int i = left; i <= right; i++){
                if(checkDivide(i))
                    result.add(i);
            }
            return result;
        }

        public boolean checkDivide(int num){
            int value = num;
            while(value != 0){
                int ones = value % 10;
                value = value / 10;
                if(ones == 0 || num % ones != 0)
                    return false;
            }
            return true;
        }

    }
}
