package com.example.codingpractice;

import java.util.Scanner;

public class findMaxSubArrayOfSizeBruteForce {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n=keyboard.nextInt();
        int k=keyboard.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=keyboard.nextInt();
        }
        keyboard.close();
        //System.out.printf("The max sub of the array of length %d = %d%n",k,findMaxSumSubArray(a,k));
        System.out.printf("Max sum subarray of size %d = %d%n", k, findMaxSumSubarrayOfSizeKBruteForce(a, k));
    }
    private static int findMaxSumSubarrayOfSizeKBruteForce(int[] a, int k) {
//        int maxSum =0, arraySum;
//        for(int i=0;i<a.length-k+1;i++)
//        {
//            arraySum=0;
//            for(int j=i;j<i+k;j++)
//            {
//                arraySum += a[j];
//            }
//            maxSum = Math.max(maxSum,arraySum);
//        }
        if(a.length == 0 || k == 0)
        {
            return 0;
        }
        int windowStart =0;
        int windowEnd =0;
        int windowSum=0;
        int maxSum =Integer.MIN_VALUE;
        for(windowEnd=0; windowEnd<a.length;windowEnd++)
        {
            windowSum += a[windowEnd];
            if(windowEnd-windowStart+1 == k)
            {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= a[windowStart];
                windowStart++;
            }
        }
        return maxSum;
    }
}
