package YoutuberKevin;

import java.util.ArrayList;
import java.util.List;

/**
 * T: O(n)
 * S: O(1)
 */
public class FizzBuzz {
    class Solution {
        public List<String> fizzBuzz(int n) {
            List<String> result = new ArrayList<>();

            if (n == 0) return result;

            for (int i = 1, fizz = 0, buzz = 0; i <= n; i++) {
                fizz++;
                buzz++;

                if (fizz == 3 && buzz == 5) {
                    result.add("FizzBuzz");
                    fizz = 0;
                    buzz = 0;
                } else if (fizz == 3) {
                    result.add("Fizz");
                    fizz = 0;
                } else if (buzz == 5) {
                    result.add("Buzz");
                    buzz = 0;
                } else {
                    result.add(Integer.toString(i));
                }
            }
            return result;
        }
    }
}
