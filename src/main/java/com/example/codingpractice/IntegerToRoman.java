package com.example.codingpractice;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class IntegerToRoman {
    public static String intToRoman(int num) {
//        String roman[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
//        int integers[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
//        String ans = "";
//
//        for (int i = 0; i < roman.length; i++) {
//            while (num >= integers[i]) {
//                ans = ans + roman[i];
//                num = num - integers[i];
//
//            }
//        }
//        return ans;
        HashMap<String,Integer> map1= new LinkedHashMap<String,Integer>();

        map1.put("M",1000);
        map1.put("CM",900);
        map1.put("D",500);
        map1.put("CD" ,400);
        map1.put("C" ,100);
        map1.put("XC",90);
        map1.put("L",50);
        map1.put("XL",40);
        map1.put("X" ,10);
        map1.put("IX",9);
        map1.put("V",5);
        map1.put("IV" ,4);
        map1.put("I" ,1);

        StringBuilder sb = new StringBuilder();
        for(String val:map1.keySet()){
            while(num - map1.get(val)>=0){
                sb.append(val);
                num=num- map1.get(val);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = intToRoman(58);
        System.out.println(str);
    }
}
