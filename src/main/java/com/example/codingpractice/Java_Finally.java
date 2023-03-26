package com.example.codingpractice;

public class Java_Finally {
    public static int greet(){
        try{
            int a =9;
            int b =0;
            int c =a/b;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("This is the end of the Function");
        }
        return 0;
    }
    public static void main(String[] args) {
        greet();
    }
}
