package com.example.codingpractice;
import java.io.*;
import java.util.*;
public class OccuranceofAnagram {
        public static int countAnagrams(String pat, String txt)
        {
           int windowSize = pat.length();
           HashMap<Character, Integer> patMap = new HashMap<>();
           for(int i=0; i<windowSize; i++)
           {
               if(patMap.containsKey(pat.charAt(i)))
               {
                   patMap.put(pat.charAt(i),patMap.get(pat.charAt(i))+1);
               }
               else
               {
                   patMap.put(pat.charAt(i),1);
               }
           };
           HashMap<Character, Integer> txtMap = new HashMap<>();
           int initPoint = 0;
           int count = 0;
           for(int j=0; j<txt.length();j++)
           {
               if(txtMap.containsKey(txt.charAt(j)))
               {
                   txtMap.put(txt.charAt(j),txtMap.get(txt.charAt(j))+1);
               }
               else
               {
                   txtMap.put(txt.charAt(j),1);
               };
               if(j-initPoint+1 == windowSize)
               {
                   boolean isAnagram = patMap.equals(txtMap);
                   if(isAnagram)
                   {
                       count++;
                   }
                   if(txtMap.containsKey(txt.charAt(initPoint)))
                   {
                       int val = txtMap.get(txt.charAt(initPoint));
                       if(val >1)
                       {
                           txtMap.put(txt.charAt(initPoint),val-1);
                       }
                       else
                       {
                           txtMap.remove(txt.charAt(initPoint));
                       }
                   };
                   initPoint++;
               }

           }
            return count;
        }
        // Driver code
        public static void main(String args[])
        {
            String pat = "forxxorfxdofr";
            String txt = "for";
            System.out.print(countAnagrams(pat, txt));
        }
    }

