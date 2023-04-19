package com.example.codingpractice;

public class PrintRev {
    public static void printRReverse(String str, int n)
    {
        if(n == 0)
        {
            System.out.println(str.charAt(n));
            return;
        }
        System.out.print(str.charAt(n));
        printRReverse(str,n-1);
    }
    public static void main(String[] args) {
        String str = "Abhishek Kumar";
        printRReverse(str, str.length()-1);
    }
}
