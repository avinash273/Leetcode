package Amazon;

import java.util.HashMap;

/**
 * T: O(n)
 * S: O(1)
 */
public class RomanToInteger {
    class Solution {
        public int romanToInt(String s) {
            int num = 0;
            char prev = 'a';
            HashMap<Character, Integer> map = new HashMap<>();
            map.put('a', 0);
            map.put('I', 1);
            map.put('V', 5);
            map.put('X', 10);
            map.put('L', 50);
            map.put('C', 100);
            map.put('D', 500);
            map.put('M', 1000);

            int i = s.length() - 1;

            while (i >= 0) {
                if (i == s.length() - 1) {
                    num = map.get(s.charAt(i));
                    prev = s.charAt(i);
                    i--;
                } else {
                    if (map.get(prev) <= map.get(s.charAt(i))) {
                        num += map.get(s.charAt(i));
                        prev = s.charAt(i);
                        i--;
                    } else {
                        num -= map.get(s.charAt(i--));
                    }
                }
            }
            return num;
        }
    }
}
