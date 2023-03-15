package com.example.codingpractice;

import java.util.ArrayList;

public class CreateTargetArrayintheGivenOrder {
    public static void main(String[] args) {
        int nums[] = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i =0; i<nums.length; i++){
            a.add(index[i],nums[i]);
        }
        int[] result = new int[nums.length];
        for(int i =0;i<nums.length;i++)
        {
            result[i] = a.get(i);
        }
    }
}
