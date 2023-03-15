package com.example.codingpractice;

public class Varags {
    public static void main(String[] args) {
        Varags obj = new Varags();
        int b=obj.sum(1,2,3);
        int c=obj.sum(1,2,3,5,7,8,9,0,10);
        System.out.println(b+" "+c);
    }

      int sum(int ...arr) {
        int a =0;
        for(int i:arr)
        {
            a += i;
        }
        return a;
    }
}
