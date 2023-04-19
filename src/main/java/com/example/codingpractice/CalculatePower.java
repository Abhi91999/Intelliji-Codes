package com.example.codingpractice;

public class CalculatePower {
    public static int calPower(int x, int n)
    {
        if(n == 0)
            return 1;
        if(x == 0)
            return 0;
        if(n%2==0)
            return calPower(x,n/2) * calPower(x,n/2);
        else
            return calPower(x,n/2) * calPower(x,n/2)*x;
    }
    public static void main(String[] args) {
    int i = 5;
    int n =3;
        System.out.println(calPower(i,n));
    }
}
