package com.example.codingpractice;

public class MergeQues {
    public static void main(String[] args) {
        int arr[] = {63,3,33,79,999,123,3,3,9,5,2,8};
        divideAndConquer(arr,0,arr.length-1);
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " " );
        }
        System.out.println();
    }

    private static void divideAndConquer(int[] arr, int start, int end) {
        if(start>=end)
            return;
        int mid = start + (end - start)/2;
        divideAndConquer(arr,start,mid);
        divideAndConquer(arr,mid+1,end);
        conquer(arr,start,mid,end);
    }

    private static void conquer(int[] arr, int start, int mid, int end) {
        int merger[] = new int[end-start+1];
        int idx1 = start;
        int idx2 = mid+1;
        int x = 0;
        while(idx1 <= mid && idx2 <= end)
        {
            if(arr[idx1] <= arr[idx2])
            {
                merger[x++] = arr[idx1++];
            }
            else {
                merger[x++] = arr[idx2++];
            }
        }
        while(idx1 <= mid)
        {
            merger[x++] = arr[idx1++];
        }
        while(idx2 <= end)
        {
            merger[x++] = arr[idx2++];
        }
        for(int i=0, j=start;i<merger.length;i++,j++)
        {
            arr[j] = merger[i];
        }
    }
}
