package Leetcode;

class twoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int aPointer = 0;
        int bPointer = numbers.length-1;

        while(aPointer <= bPointer ){
            int sum = numbers[aPointer] + numbers[bPointer];

            if(sum < target){
                aPointer++;
            }
            else if(sum > target){
                bPointer--;
            }
            else
                return new int[] {aPointer+1, bPointer+1};
        }
        return new int[] {};
    }
}