package com.example.codingpractice;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
    int arr[] = {42,9,1,3,7,9,4,5,6,799};
    RadixSorting(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
    private static void RadixSorting(int arr[])
    {
        int max = Arrays.stream(arr).max().getAsInt();
//        do count sort for every digit
        for(int exp = 1; max/exp > 0; exp *= 10)
        {
            countSort(arr, exp);
        }
    }
    private static void countSort(int arr[], int exp)
    {
        int n = arr.length;
        int[]  output = new int[n];
        int[] count = new int[10];
        Arrays.fill(count,0);

        for(int i=0; i<n; i++)
        {
            count[(arr[i]/exp)%10]++;
        }
        for(int i=1; i<10; i++)
        {
            count[i] = count[i] + count[i-1];
        }
        for(int i = n-1; i>= 0; i--)
        {
            output[count[(arr[i]/exp) %10] - 1] = arr[i];
            count[(arr[i]/exp) % 10] --;
        }
        System.arraycopy(output, 0, arr, 0, n);
    }
}
