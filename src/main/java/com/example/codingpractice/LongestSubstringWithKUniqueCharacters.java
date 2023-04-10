package com.example.codingpractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestSubstringWithKUniqueCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int k = sc.nextInt();
        sc.close();
        System.out.printf("The longestSubString %d =%d%n",k,countlongestSubstring(text,k));
    }

    private static int countlongestSubstring(String text, int k) {
        int len = text.length();
        int startWindow =0, endWindow =0;
        int maxLen =-1;
        Map<Character, Integer> map = new HashMap<>();
        for(;endWindow<len;endWindow++)
        {
            char c= text.charAt(endWindow);
            map.put(c,map.getOrDefault(c,0)+1);
            while(map.size() > k)
            {
                char leftChar = text.charAt(startWindow);
                map.put(leftChar,map.get(leftChar)-1);
                if(map.get(leftChar) == 0)
                {
                    map.remove(leftChar);
                }
                startWindow++;
            }
            if(map.size() == k)
            {
                maxLen = Math.max(maxLen, endWindow-startWindow+1);
            }
        }
        return maxLen;
    }
}
