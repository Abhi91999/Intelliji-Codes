package com.example.codingpractice;

public class PrintPermutation {
    public static void printPer(String str, String permutattion)
    {
        if(str.length() == 0)
        {
            System.out.println(permutattion);
            return;
        }
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            String newString = str.substring(0,i)+ str.substring(i+1);
            printPer(newString, permutattion+ch);
        }
    }
    public static void main(String[] args) {
    printPer("abc", "");
    }
}
