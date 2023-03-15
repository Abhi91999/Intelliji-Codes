package com.example.codingpractice;

import java.util.Random;

public class LeapYearCode {
    public static void main(String[] args) {
        int year = 2023;
        Random rm = new Random();
        int wordNumber = rm.nextInt( 3 ) + 1;
        System.out.println(wordNumber);
        boolean leap;
        if(year % 4 == 0)
        {
            if(year % 100 ==0)
            {
                if(year % 400 == 0)
                {
                    leap = true;
                }
                else{
                    leap = false;
                }

            }
            else {
                leap = true;
            }
        }
        else
        {
            leap = false;
        }

        if (leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}