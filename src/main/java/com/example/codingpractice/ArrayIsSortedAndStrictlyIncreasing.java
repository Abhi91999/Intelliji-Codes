package com.example.codingpractice;

public class ArrayIsSortedAndStrictlyIncreasing {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,6,8,9};
        System.out.println(checkIsSorted(nums,0));
    }

    private static boolean checkIsSorted(int[] nums, int idx) {
        if(idx == nums.length-1)
        {
            return true;
        }
        if(nums[idx] >= nums[idx+1])
        {
            return false;
        }
        else
        {
            return checkIsSorted(nums,idx+1);
        }

    }
}
