package com.example.codingpractice;

import java.util.Arrays;

public class LeftandRightSumDifferences {
    public static void main(String[] args) {
//        int nums[] = {10,4,8,3};
//        for(int i=0;i<nums.length;i++){
//            System.out.print(nums[i]);}
//            System.out.println();
//        int len = nums.length;
//        int[] leftsum = new int[len];
//        int[] rightsum = new int[len];
//        for(int i=1;i<len;i++)
//        {
//            leftsum[i] = leftsum[i-1] + nums[i-1];
//        }
//        for(int i=0;i<nums.length;i++){
//            System.out.print(leftsum[i]);}
//            System.out.println();
//        for(int i=len-2;i>=0;i--)
//        {
//            rightsum[i] = rightsum[i+1] + nums[i+1];
//        }
//        for(int i=0;i<nums.length;i++){
//            System.out.print(rightsum[i]);}
//            System.out.println();
//        int result[] = new int[len];
//        for(int i=0;i<len;i++)
//        {
//            result[i] = Math.abs(leftsum[i] - rightsum[i]);
//        }
//        for(int i=0;i<nums.length;i++){
//            System.out.print(result[i]);}
//            System.out.println();
        int nums[] = {10, 4, 8, 3};
        int leftSum = 0, rightSum = 0, n = nums.length;
        for (int num : nums) rightSum += num;
        for (int i = 0; i < n; i++) {
            int val = nums[i];
            rightSum -= val;
            nums[i] = Math.abs(leftSum - rightSum);
            leftSum += val;
        }
    }
}
