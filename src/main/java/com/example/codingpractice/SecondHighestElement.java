package com.example.codingpractice;

public class SecondHighestElement {
    public static void main(String[] args) {
        int[] arr = {30,4,9,6,7,8};
        int ans = findSecondHighest(arr);
        System.out.println(ans);
    }

    private static int findSecondHighest(int[] arr) {
        int len = arr.length;
        for(int i=0; i<len;i++)
        {
            for(int j= i+1; j< len;j++)
            {
                if(arr[i] > arr[j])
                {
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }
            }
        }
        return arr[arr.length -2];
    }
}
