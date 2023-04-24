package com.example.codingpractice;

public class PrintCombination {
    public static String[] keyboard = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printCombi(String str, int idx, String combination)
    {
        if(idx == str.length())
        {
            System.out.println(combination);
            return;
        }
        char ch = str.charAt(idx);
        String mapping = keyboard[ch - '0'];
        for(int i=0;i<mapping.length();i++)
        {
            printCombi(str,idx+1,combination+ mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        printCombi("23", 0, "");
    }
}
