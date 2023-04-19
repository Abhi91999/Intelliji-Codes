package com.example.codingpractice;

public class RecurssionFibonacci {
    public static void printFibbo(int a, int b, int sum)
    {
        if(sum == 0)
        {
            return;
        }
        int c = a+b;
        System.out.println(c);
        printFibbo(b,c,sum-1);
    }
    public static void main(String[] args) {
        int a=0;
        int b= 1;
        System.out.println(a);
        System.out.println(b);
        int n=7;
        printFibbo(a,b,n-1);
    }
}
