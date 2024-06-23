package org.code.LeetcodeAmazon;

import java.util.Stack;

/**
 * T: O(n)
 * S: O(n)
 */

public class asteroidCollision {
    class Solution {
        public int[] asteroidCollision(int[] asteroids) {
            Stack<Integer> stack = new Stack<>();
            int i = 0;

            while (i < asteroids.length) {
                if (asteroids[i] > 0)
                    stack.push(asteroids[i]);
                else {
                    while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(asteroids[i])) {
                        stack.pop();
                    }
                    if (stack.isEmpty() || stack.peek() < 0)
                        stack.push(asteroids[i]);
                    else if (stack.peek() == Math.abs(asteroids[i]))
                        stack.pop();
                }
                i++;
            }
            int[] remains = new int[stack.size()];
            for (i = stack.size() - 1; i >= 0; i--)
                remains[i] = stack.pop();
            return remains;
        }
    }
}
