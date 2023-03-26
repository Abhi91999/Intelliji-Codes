package com.example.codingpractice;

import java.util.Date;

public class DateJava {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
        Date d = new Date();
        System.out.println(d);


    }
}
