package com.example.codingpractice;

public class Sqrtx {
    public static void main(String[] args) {
        int x =81;
//        if(x == 0) System.out.println(0);
//        int start = 1;
//        int end = Integer.MAX_VALUE;
//        while(true)
//        {
//            int mid = start + (end-start)/2;
//            if(mid > x/mid)
//            {
//                end = mid -1;
//            }
//            else
//            {
//                if(mid+1 > x/(mid+1))
//                    System.out.println(mid);
//                start = mid+1;
//            }
//        }
        long r = x;
        while (r*r > x)
            r = (r + x/r) / 2;
        System.out.println((int) r);
    }
}
