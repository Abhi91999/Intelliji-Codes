package com.example.codingpractice;

public class SubSequenceofString {
    public static void subSeq(String str, int idx, String newString)
    {
        if(idx == str.length())
        {
            System.out.println(newString);
            return;
        }
        char ch = str.charAt(idx);
        subSeq(str,idx+1,newString+ch);
        subSeq(str, idx+1, newString);
    }
    public static void main(String[] args) {
        subSeq("cdwf",0,"");
    }

}
