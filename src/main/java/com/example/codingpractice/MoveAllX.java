package com.example.codingpractice;

public class MoveAllX {
    public static void moveAllX(String str, int idx, int count, String newString)
    {
        if(idx == str.length())
        {
            for(int i=0; i<count;i++) {
                newString+='x';
            }
            System.out.println(count);
            System.out.println(newString);
            return;
        }
        char ch = str.charAt(idx);
        if(ch == 'x')
        {
            count++;
            moveAllX(str, idx+1, count, newString);
        }
        else {
            newString += ch;
            moveAllX(str, idx+1, count, newString);
        }
    }
    public static void main(String[] args) {
        String str = "xxxabsxcdlkdnxxalsnxxx";
        moveAllX(str,0,0," ");
    }
}
