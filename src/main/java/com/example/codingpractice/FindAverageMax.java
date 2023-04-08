package com.example.codingpractice;

public class FindAverageMax {
    public static void main(String[] args) {
        int [] nums = {1,12,-5,-6,50,3};
        int k=4;
        System.out.println(findMaxAverage(nums,k));

    }
    public static double findMaxAverage(int[] nums, int k) {
        int left = 0;
        double ans = 0.0;
        double sum = 0;
        long count = 0;
        double max = Integer.MIN_VALUE;
        for(int right=0;right<nums.length;right++)
        {
            sum += nums[right];
            count++;
            if(count == k)
            {
                max = Math.max(max, sum/k);
            }
            while(count > k)
            {
                sum -= nums[left];
                count--;
                left++;
                max= Math.max(max, sum/k);
            }
        }
        return max;
    }
}
