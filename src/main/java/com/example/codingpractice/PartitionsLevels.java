package com.example.codingpractice;

import java.util.ArrayList;
import java.util.List;

public class PartitionsLevels {
    public static List<Integer> partitionLabels(String s) {
        ArrayList<Integer> parts = new ArrayList<Integer>();
        int max=0,premax=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.lastIndexOf(s.charAt(i))>max )
            {
                max=s.lastIndexOf(s.charAt(i));
                System.out.println(s.lastIndexOf(s.charAt(i)) + "I am the last index");
                //System.out.println(max+" char is"+s.charAt(i));
            }
            if(i==max)
            {
                parts.add(max+1-premax);
                premax=max+1;
            }

        }
        return(parts);
    }

    public static void main(String[] args) {
        String s = "ababcbacadefegdehijhklij";
        List<Integer> abs=  partitionLabels(s);
        Object[] c = abs.toArray();
        for(int i =0 ;i<c.length;i++)
        {
            System.out.println(c[i]);
        }


    }
}
