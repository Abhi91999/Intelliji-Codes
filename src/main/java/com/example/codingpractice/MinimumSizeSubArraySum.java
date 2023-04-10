package com.example.codingpractice;

import java.util.Scanner;

public class MinimumSizeSubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int k =sc.nextInt();
        int[] a = new int[len];
        for(int i=0; i<len; i++)
        {
            a[i] = sc.nextInt();
        }
        sc.close();
//        System.out.printf("The minimum Size of length of array present in array is %d%n",k,countMinNumArray(a,k));
        System.out.printf("Length of the Smallest subarray with sum greater than or equal to %d = %d%n", k, countMinNumArray(a, k));

    }
//2, 1, 4, 3, 2, 5
    //3, 4, 1, 1, 6
    private static int countMinNumArray(int[] a, int k) {
        int startWindow = 0, endWindow =0;
        int lengthOfSmallestSubArray = Integer.MIN_VALUE;
        int windowSum =0;
//        for(;endWindow<a.length;endWindow++)
//        {
//            int currentSubArraySum =0;
//            for(int j=endWindow;j<a.length;j++)
//            {
//                currentSubArraySum += a[j];
//                if(currentSubArraySum >= k)
//                {
//                    lengthOfSmallestSubArray = Math.min(currentSubArraySum,j-endWindow+1);
//                    break;
//                }
//            }
//        }
        for(;endWindow<a.length;endWindow++)
        {
            windowSum += a[endWindow];
            while(windowSum > k)
            {
                windowSum -= a[startWindow];
                startWindow++;
            }
            if(windowSum == k)
            {
                lengthOfSmallestSubArray = endWindow-startWindow+1;
                //lengthOfSmallestSubArray = Math.min(lengthOfSmallestSubArray,endWindow-startWindow+1);
                lengthOfSmallestSubArray = Math.min(lengthOfSmallestSubArray, endWindow-startWindow+1);
            }
        }
        return lengthOfSmallestSubArray == Integer.MIN_VALUE ? 0 : lengthOfSmallestSubArray;
    }
}
