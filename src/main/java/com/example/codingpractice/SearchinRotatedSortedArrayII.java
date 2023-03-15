package com.example.codingpractice;

public class SearchinRotatedSortedArrayII {
    public static void main(String[] args) {
        int nums[] = {1,0,1,1,1};
        int target = 0;
        int start=0;
        int end = nums.length-1;
        int mid =0;
        while(start <= end) {
            mid = (start + end) / 2;
            if (nums[mid] == target) {
                System.out.println(true);
            }
            //If we know for sure right side is sorted or left side is unsorted
            if (nums[mid] < nums[end] || nums[mid] < nums[start]) {
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
                //If we know for sure left side is sorted or right side is unsorted
            } else if (nums[mid] > nums[start] || nums[mid] > nums[end]) {
                if (target < nums[mid] && target >= nums[start]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
                //If we get here, that means nums[start] == nums[mid] == nums[end], then shifting out
                //any of the two sides won't change the result but can help remove duplicate from
                //consideration, here we just use end-- but left++ works too
            } else {
                end--;
            }
        }

        System.out.println(false);
    }
}


