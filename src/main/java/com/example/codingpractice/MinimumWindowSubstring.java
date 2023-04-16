package com.example.codingpractice;

import java.util.*;
import java.util.Scanner;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String word = sc.next();
        String text = sc.next();
        sc.close();
        System.out.printf("The word having maximum length is %s%n",countLengthofString(word,text));
    }

    private static String countLengthofString(String word, String text) {
        int startWindow =0,endWindow =0;
        int n = word.length();
        int minWindowSubStringLength = Integer.MAX_VALUE;
        int minWindowSubstrStart =0;
        Map<Character,Integer> windowCharmap = new HashMap<>();
        Map<Character,Integer> subStrMap = new HashMap<>();
        for(int i=0;i<text.length();i++)
        {
            char c = text.charAt(i);
            subStrMap.put(c,subStrMap.getOrDefault(c,0)+1);
        }
        for(;endWindow<word.length();endWindow++)
        {
            char ch = word.charAt(endWindow);
            windowCharmap.put(ch,windowCharmap.getOrDefault(ch,0)+1);
            while(containsAll(windowCharmap,subStrMap))
            {
                if(endWindow-startWindow+1 < minWindowSubStringLength)
                {
                    minWindowSubStringLength = endWindow-startWindow+1;
                    minWindowSubstrStart = startWindow;
                }
                char leftChar = word.charAt(startWindow);
                windowCharmap.put(leftChar,windowCharmap.get(leftChar)-1);
                if(windowCharmap.get(leftChar) == 0)
                {
                    windowCharmap.remove(leftChar);
                }
                startWindow++;
            }
        }
        return word.substring(minWindowSubstrStart,minWindowSubstrStart+minWindowSubStringLength);
    }

    private static boolean containsAll(Map<Character, Integer> windowCharmap, Map<Character, Integer> subStrMap) {
        for(Map.Entry<Character,Integer> entry : subStrMap.entrySet())
        {
            char c = entry.getKey();
            int count = entry.getValue();
            if(!windowCharmap.containsKey(c))
            {
                return false;
            }
            if(windowCharmap.get(c) < count)
            {
                return false;
            }
        }
        return true;
    }
}
