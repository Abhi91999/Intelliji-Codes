package com.example.codingpractice;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] nums = new int[]{-3,-2,-3};
        System.out.println(maxSubarraySumCircular(nums));
    }
    public static int maxSubarraySumCircular(int[] nums) {
        int acc = 0;
        int max1 = kadane(nums);
        for(int i = 0; i < nums.length; i++) {
            acc += nums[i];
            nums[i] = -nums[i];
        }
        int min = kadane(nums);
        int max2 =acc + min;
        if(max2 == 0)  return max1;
        return Math.max(max1, max2);
    }
    public static int kadane(int[] array) {
        // int maxSum = array[0];
        // int max = array[0];
        // for(int i = 1; i < array.length; i++) {
        //     maxSum = Math.max(maxSum+array[i], array[i]);
        //     max = Math.max(max, maxSum);
        // }
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
        for(int i=0; i<array.length; i++)
        {
            curSum += array[i];
            maxSum = Math.max(curSum,maxSum);
            if(curSum<0)
            {
                curSum = 0;
            }
        }
        return maxSum;
    }
}
