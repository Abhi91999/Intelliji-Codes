package com.example.codingpractice;

public class FindMinimuminRotatedSortedArrayII {
    public static void main(String[] args) {
        int nums[] = {2,2,2,0,1};
        int lo = 0, hi = nums.length - 1;
        while (lo <= hi) {
            int mi = lo + (hi - lo) / 2;
            if (nums[mi] > nums[hi]) {
                lo = mi + 1;
            }
            else if (nums[mi] < nums[lo]) {
                hi = mi;
                lo++;
            }
            else { // nums[lo] <= nums[mi] <= nums[hi]
                hi--;
            }
        }
        System.out.println(nums[lo] + "" +lo);
    }
}
