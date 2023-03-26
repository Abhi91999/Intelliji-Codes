package com.example.codingpractice;

public class EvenOddBits {
    public static void main(String[] args) {
        int n =17;
        int arr[] = new int[2];
        int index =0;
        while(n!=0)
        {
            if(n%2==1)
            {
                if(index%2==1)
                {
                    arr[1]++;
                }
                else
                {
                    arr[0]++;
                }
            }
            n=n/2;
            index++;

        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
