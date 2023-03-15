package com.example.codingpractice;

public class RotatedArrays {
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        int target = 1;
        int start = 0;
        int end = nums.length-1;
        int mid = 0;
        while(start < end)
        {
            // 4,5,6,7,0,1,2
            mid = start + (end-start)/2;
            if(nums[mid] == target)
            {
                System.out.println(mid);
            }
            if(nums[start] <= nums[mid])
            {
                if(target >= nums[start] && target < nums[mid])
                {
                    end = mid-1;
                }
                else
                {
                    start = mid+1;
                }
            }
            else
            {
                if(target > nums[mid] && target <= nums[end])
                {
                    start = mid+1;
                }
                else
                {
                    end = mid -1;
                }
            }
        }
        System.out.println(nums[start] == target ? start : -1);
    }
}
