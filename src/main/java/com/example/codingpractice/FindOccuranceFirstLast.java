package com.example.codingpractice;

public class FindOccuranceFirstLast {
    public static int first = -1;
    public static int last = -1;
    public static void findOccurance(String str, int idx, char ele)
    {
        if(idx == str.length())
        {
            System.out.println("The first element is " +first+ " and the last element is " + last);
            return;
        }
        char curr = str.charAt(idx);
        if(curr == ele)
        {
            if(first == -1)
            {
                first = idx+1;
            }
            else
            {
                last = idx+1;
            }
        }
        findOccurance(str, idx+1, ele);
    }
    public static void main(String[] args) {
        String str = "bcdabhsjisysjska";
        findOccurance(str, 0, 'a');
    }
}
