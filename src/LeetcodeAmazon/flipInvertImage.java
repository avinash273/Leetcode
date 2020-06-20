package LeetcodeAmazon;

/**
 * T: O(mn)
 * S: O(1)
 */
public class flipInvertImage {

    class Solution {
        public int[][] flipAndInvertImage(int[][] A) {
            for(int i = 0; i < A.length; i++){
                int left = 0;
                int right = A[i].length - 1;
                int temp = 0;
                while(left < right){
                    temp = A[i][left];
                    A[i][left++] = A[i][right];
                    A[i][right--] = temp;
                }

                for(int j = 0; j < A[i].length; j++){
                    A[i][j] = A[i][j] == 0 ? 1 : 0;
                }

            }
            return A;
        }
    }

    /**
     * bad solution
     */
    class Solution2 {
        public int[][] flipAndInvertImage(int[][] A) {
            if(A == null || A.length <= 0)
                return A;

            return invert(flip(A));
        }

        int[][] flip(int[][] A){

            for(int i = 0; i < A.length; i++){
                int left = 0;
                int right = A[i].length - 1;
                int temp = 0;
                while(left < right){
                    temp = A[i][left];
                    A[i][left] = A[i][right];
                    A[i][right] = temp;
                    left++;
                    right--;
                }
            }
            return A;
        }

        int[][] invert(int[][] A){
            for(int i = 0; i < A.length; i++){
                for(int j = 0; j < A[i].length; j++){
                    A[i][j] = A[i][j] == 0 ? 1 : 0;
                }
            }
            return A;
        }
    }
}
