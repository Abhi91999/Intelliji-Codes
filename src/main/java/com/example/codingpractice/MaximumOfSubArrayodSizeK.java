package com.example.codingpractice;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MaximumOfSubArrayodSizeK {
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
        int[] result = maxOfSubArray(a,k);
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }

    private static int[] maxOfSubArray(int[] a, int k) {
        int n=a.length;
        int idx =0;
        int[] maxSubArray = new int[n-k+1];
        //1, 2, 3, 1, 4, 5, 2, 3, 6
//        for(int i=0; i<n-k+1;i++)
//        {
//            int maxElement = Integer.MIN_VALUE;
//            for(int j=i; j<i+k; j++)
//            {
//                if(a[j] > maxElement)
//                {
//                    maxElement = a[j];
//                }
//            }
//            maxSubArray[idx++] = maxElement;
//        }
        PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
        int startWindow =0, endWindow =0;
        for(;endWindow<n;endWindow++)
        {
            q.add(a[endWindow]);
            if(endWindow-startWindow+1 == k)
            {
                int maxElement = q.peek();
                maxSubArray[idx++] = maxElement;
                if(maxElement == a[startWindow])
                {
                   q.remove();
                }
                startWindow++;
            }
        }
        return maxSubArray;
    }
}
