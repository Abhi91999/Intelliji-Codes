package com.example.codingpractice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalanderCheck {
    public static void main(String[] args) {
        Calendar ch = Calendar.getInstance();
        LocalDate dt = LocalDate.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String myDate = dt.format(df);
        System.out.println(ch.getCalendarType());
        System.out.println(ch.getTimeZone());
        System.out.println(dt);
        System.out.println(myDate);
    }
}
