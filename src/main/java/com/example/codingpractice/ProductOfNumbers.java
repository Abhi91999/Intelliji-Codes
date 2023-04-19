package com.example.codingpractice;

public class ProductOfNumbers {
    public static void main(String[] args) {
        System.out.println(productnumbers(3));
    }

    private static int productnumbers(int i)   //int i, int n, int sum
    {
//        if(i==n)
//        {
//            sum+=i;
//            System.out.println(sum);
//            return;
//        }
//        sum+=i;
//        //System.out.println(sum);
//        productnumbers(i+1, n, sum);
        if(i==1 || i==0)
            return 1;
        int factcal = productnumbers(i-1);
        int sum = i * factcal;
        return sum;
    }

}
