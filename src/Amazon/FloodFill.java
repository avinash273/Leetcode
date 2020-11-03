package Amazon;

/**
 * T: O(mn)
 * S: O(mn)
 */
public class FloodFill {
    class Solution {
        public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
            //if it is already recolored to the new one then even though you keep on changing it will be the same color and will result in loop and resulting in stack overflow.
            if (image[sr][sc] == newColor) return image;
            dfs(image, sr, sc, newColor, image[sr][sc]);
            return image;
        }

        public void dfs(int[][] image, int i, int j, int newColor, int oldColor) {
            if (i < 0 || i >= image.length || j < 0 || j >= image[i].length || image[i][j] != oldColor)
                return;
            image[i][j] = newColor;

            dfs(image, i + 1, j, newColor, oldColor);
            dfs(image, i - 1, j, newColor, oldColor);
            dfs(image, i, j + 1, newColor, oldColor);
            dfs(image, i, j - 1, newColor, oldColor);
            return;
        }
    }
}
