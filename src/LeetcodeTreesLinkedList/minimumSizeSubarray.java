package LeetcodeTreesLinkedList;

public class minimumSizeSubarray {
    class Solution {
        public int minSubArrayLen(int s, int[] nums) {
            int result = Integer.MAX_VALUE;

            int left = 0;
            int valSum = 0;
            for(int i = 0; i < nums.length; i++){
                valSum += nums[i];

                while(valSum >= s){
                    result = Math.min(result, i + 1 - left);
                    valSum -= nums[left];
                    left++;
                }
            }
            return (result != Integer.MAX_VALUE) ? result : 0;
        }
    }
}
