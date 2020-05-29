package Leetcode;

/**
 * start a robot at origin and end at origin
 * time - O(n)
 * Space - O(1)
 */

class robotCircles {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        char[] tokens = moves.toCharArray();
        int size = tokens.length;

        if (size < 2)
            return false;

        for (char move : tokens) {
            if (move == 'U')
                y++;
            else if (move == 'D')
                y--;
            else if (move == 'L')
                x--;
            else
                x++;
        }

        return x == 0 && y == 0;
    }
}
