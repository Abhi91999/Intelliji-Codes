package com.example.codingpractice;
import java.util.*;
class Check1 extends Thread{
    public void run() {
//        int i=0;
//        while (i<100) {
//            System.out.println("I am Happy");
//            i++;
//        }
        System.out.println("Welcome");
    }
}
class Check4 extends Check1{
    public void run(){
//        while(true)
//        {
//            try{
//                Thread.sleep(200);
//            }
//            catch (Exception e)
//            {
//                System.out.println(e);
//            }
            System.out.println("Happy for the day");
        }
    }

public class ThreadCheck {
    public static void main(String[] args) {
        Check1 c1 = new Check1();
        Check4 c4 = new Check4();
//        c1.setPriority(6);
//        c4.setPriority(9);
        System.out.println(c1.getPriority());
        System.out.println(c4.getPriority());
        System.out.println(c1.getState());
        System.out.println(c4.getState());
        c1.start();
        c4.start();
        System.out.println(c1.getState());
        System.out.println(c4.getState());
        System.out.println(Thread.currentThread().getState());
    }
}
