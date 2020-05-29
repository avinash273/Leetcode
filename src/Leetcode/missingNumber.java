package Leetcode;

class missingNumber {
    public int missingNumber(int[] nums) {
        // sum = n*(n+1)/2
        int size = nums.length;
        int expSum = size*(size+1)/2;
        int actualSum = 0;

        for(int num:nums)
            actualSum += num;
        return Math.abs(expSum - actualSum);

    }
}