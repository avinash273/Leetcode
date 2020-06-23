package LeetcodeAmazon;

public class sortArrayByParity {
    class aviSolution {
        public int[] sortArrayByParity(int[] A) {
            int[] output = new int[A.length];

            if(A.length <= 0)
                return output;

            int left = 0;
            int right = A.length - 1;

            int index = 0;
            while(left <= right){
                if(A[index] % 2 == 0)
                    output[left++] = A[index];
                else
                    output[right--] =  A[index];
                index++;
            }
            return output;
        }
    }
}
