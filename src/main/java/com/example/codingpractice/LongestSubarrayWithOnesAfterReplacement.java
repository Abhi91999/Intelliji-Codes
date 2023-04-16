package com.example.codingpractice;

import java.util.Scanner;

public class LongestSubarrayWithOnesAfterReplacement {
   public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int len = sc.nextInt();
//        int k= sc.nextInt();
//        int[] a = new int[len];
        int[] a = new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;
//        for(int i=0;i<len;i++)
//        {
//            a[i]=sc.nextInt();
//        }
        System.out.printf("The longest length of replaced 0's in the array is %d%n", replaceZerosFromArray(a,k));
    }

    private static int replaceZerosFromArray(int[] a, int k) {
        int maxOnes = Integer.MIN_VALUE;
        int numReplacement =0;
        int startWindow =0;
        int endWindow =0;
        for(;endWindow<a.length;endWindow++)
        {
            if(a[endWindow] ==0)
            {
                numReplacement++;
            }
            while(numReplacement > k)
            {
                if(a[startWindow] == 0)
                {
                    numReplacement--;
                }
                startWindow++;
            }
            maxOnes = Math.max(maxOnes, endWindow-startWindow+1);
        }
        return maxOnes;
    }
}
