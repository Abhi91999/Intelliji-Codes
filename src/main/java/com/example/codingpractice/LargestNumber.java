package com.example.codingpractice;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{3,30,34,5,9};
        System.out.printf("The longest number in array is %s%n",largestNumber(nums));
    }
    public static class Comparable implements Comparator<Integer> {
        @Override
        public int compare(Integer a,Integer b) {
            int c = a.intValue();
            int d = b.intValue();
            String e = c+""+d;
            String f = d+""+c;
            return f.compareTo(e);
//            3,30,34,5,9
        }
    }

    public static String largestNumber(int[] nums) {
        Integer[] a = new Integer[nums.length];
        for(int i = 0;i<nums.length;i++)
            a[i] = nums[i];
        Arrays.sort(a, new Comparable());
        StringBuilder sb = new StringBuilder();
        for(int x : a) {
            sb.append(x);
        }
        String ans = sb.toString();
        int ind = 0;
        for(ind = 0;ind<nums.length;ind++) {
            if(ans.charAt(ind) == '0') continue;
            else break;
        }
        return ans.substring(ind,ans.length()) == "" ? "0" : ans.substring(ind,ans.length());
    }
}
