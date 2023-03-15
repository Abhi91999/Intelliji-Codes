package com.example.codingpractice;

public class DifferenceBetweenElementSumandDigitSumofanArray {
    public static void main(String[] args) {
        int[] nums = {1,15,6,3};
        int result = 0;
        for(int v : nums) result += v - (v / 1000 + v / 100 % 10 + v % 100 / 10 + v % 10);
    }
}
