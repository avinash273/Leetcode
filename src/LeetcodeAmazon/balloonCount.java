package LeetcodeAmazon;

import java.util.HashMap;

/**
 * T: O(n)
 * S: O(n)
 */
public class balloonCount {
    class Solution {
        public int maxNumberOfBalloons(String text) {
            if (text == null)
                return 0;
            HashMap<Character, Integer> map = new HashMap<>();
            int result = 0;

            for (char c : text.toCharArray())
                map.put(c, map.getOrDefault(c, 0) + 1);
            System.out.println(map);

            if (map.containsKey('b') && map.containsKey('a') && map.containsKey('l') && map.containsKey('o') && map.containsKey('n')) {
                while (map.get('b') > 0 && map.get('a') > 0 && map.get('l') > 1 && map.get('o') > 1 && map.get('n') > 0) {
                    result++;
                    map.put('b', map.get('b') - 1);
                    map.put('a', map.get('a') - 1);
                    map.put('l', map.get('l') - 2);
                    map.put('o', map.get('o') - 2);
                    map.put('n', map.get('n') - 1);
                }
            }
            return result;
        }
    }
}
