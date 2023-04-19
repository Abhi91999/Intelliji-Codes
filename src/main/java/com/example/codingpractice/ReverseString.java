package com.example.codingpractice;

public class ReverseString {
    public static void main(String[] args) {
        printTest("Abhishek Kumar-Singh");
        printTest("Kumar Anand");
        printTest("Tu-Tera-Dekh");

    }
    public static void printTest(String src)
    {
        System.out.println(stringReverse(src));
    }
    public static String stringReverse(String src)
    {
        src = src.trim();
        StringBuilder reverseNameBuilder = new StringBuilder();
        StringBuilder currentnameBuilder = new StringBuilder();
        for(int i=0; i<src.length(); i++)
        {
            char currentChar = src.charAt(i);
            if(currentChar != ' ' && currentChar != '-')
            {
                currentnameBuilder.append(currentChar);
            }
            else
            {
                reverseNameBuilder.insert(0,currentChar+currentnameBuilder.toString());
                currentnameBuilder.setLength(0);
            }
        }
        return reverseNameBuilder.insert(0,currentnameBuilder.toString()).toString();
    }
}
