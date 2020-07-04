package LeetcodeAmazon;

/**
 * T: O(n)
 * S: O(n)
 */

public class pushDominoes {
    class Solution {
        public String pushDominoes(String input) {
            char[] dominoes = input.toCharArray();
            int n = dominoes.length;
            int[] forces = new int[n];

            int force = 0;
            for (int i = 0; i < n; i++) {

                if (dominoes[i] == 'R') {
                    force = n;
                } else if (dominoes[i] == 'L') {
                    force = 0;
                } else {
                    force = Math.max(force - 1, 0);
                }
                forces[i] += force;
            }

            force = 0;
            for (int i = n - 1; i >= 0; i--) {
                if (dominoes[i] == 'L') {
                    force = n;
                } else if (dominoes[i] == 'R') {
                    force = 0;
                } else {
                    force = Math.max(force - 1, 0);
                }
                forces[i] -= force;
            }

            StringBuilder result = new StringBuilder();
            for (int f : forces) {
                if (f > 0)
                    result.append('R');
                else if (f < 0)
                    result.append('L');
                else
                    result.append('.');
            }
            return result.toString();
        }
    }
}
