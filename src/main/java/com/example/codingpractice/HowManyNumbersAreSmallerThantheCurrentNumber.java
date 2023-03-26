package com.example.codingpractice;

public class HowManyNumbersAreSmallerThantheCurrentNumber {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3,9,10,11,5};
        int[] buck = new int[101];

        for(int i=0; i<nums.length; i++) {
            buck[nums[i]] +=1;
        }

        for(int j=1; j<=100; j++) {
            buck[j] += buck[j-1];
        }

        for(int k=0; k< nums.length; k++) {
            int pos = nums[k];
            nums[k] = pos==0 ? 0 : buck[pos-1];
        }
        for(int i=0;i<nums.length;i++)
        System.out.print(nums[i] + " ");
    }
}
