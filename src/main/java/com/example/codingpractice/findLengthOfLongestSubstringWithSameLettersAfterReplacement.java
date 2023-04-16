package com.example.codingpractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class findLengthOfLongestSubstringWithSameLettersAfterReplacement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text= sc.next();
        int k = sc.nextInt();
        sc.close();
        //System.out.printf("The longest sub string with the same letter after replacemnet %d%n",countLongestSubString(text,k));
        System.out.printf("Longest substring with same letters after replacement = %d%n", countLongestSubString(text, k));
    }

    private static int countLongestSubString(String text, int k) {
        int n = text.length();
        int maxLen = -1;
        int startWindow =0, endWindow=0;
        Map<Character, Integer> map = new HashMap<>();
        for(;endWindow<n;endWindow++) {
            char c = text.charAt(endWindow);
            map.put(c, map.getOrDefault(c, 0) + 1);
            int maxRepeatinhChar = getMaxRepatingChar(map);
            while (endWindow - startWindow + 1 - maxRepeatinhChar > k) {
                char s = text.charAt(startWindow);
                map.put(s, map.get(s) - 1);
                startWindow++;
            }
            maxLen = Math.max(maxLen, endWindow - startWindow + 1);
        }
        return maxLen;
    }


    private static int getMaxRepatingChar(Map<Character, Integer> map) {
        int maxCount =0;
        for(int count : map.values())
        {
            if(maxCount < count)
                maxCount = count;
        }
        return maxCount;
    }
}
