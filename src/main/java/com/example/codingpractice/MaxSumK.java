package com.example.codingpractice;
import java.util.*;
public class MaxSumK {
        static int max_sum_of_subarray(int arr[], int n, int k)
        {
            int sum = 0;
            int maxSum =0;
            int i=0;
            for(int j=0; j<n; j++)
            {
                sum += arr[j];
                if(j-i+1 == k)
                {
                    if(sum > maxSum) {
                        maxSum = sum;
                        sum -= arr[i];
                        i++;
                    }

                }
            }
            return maxSum;
        }
        public static void main(String[] args)
        {
            int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
            int k = 4;
            int n = arr.length;

            // by brute force
            int max_sum = max_sum_of_subarray(arr, n, k);
            System.out.println(max_sum);
        }
    }

