package com.example.codingpractice;

import java.util.Scanner;

public class ArrayPermuation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int nums[] = new int[length];
        for(int j=0;j<nums.length;j++)
        {
            nums[j] = sc.nextInt();
        }
        for(int i=0; i<nums.length;i++)
        {
            nums[i] = nums[nums[i]];
            System.out.print(nums[i] + "\t");
        }


        for(int i=0;i<length;i++)
        {
            nums[i]=nums[nums[i]];
            System.out.print(nums[i] +"");
        }
    }
}
