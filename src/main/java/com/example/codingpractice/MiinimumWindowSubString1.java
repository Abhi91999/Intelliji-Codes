package com.example.codingpractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//import static com.example.codingpractice.MinimumWindowSubstring.countLengthofString;

public class MiinimumWindowSubString1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        sc.close();
        System.out.printf("The word having maximum length is %s%n",countLengthofStringCheck(s,t));
    }

    private static String countLengthofStringCheck(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int left = 0;
        int minLeftIndex =0;
        int minLen = s.length() + 1;
        int missing = t.length(); //The number of chars are missing.
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1); //decrease the counter for c.
                if (map.get(c) >= 0) {
                    missing--;
                }
                while (missing == 0) {
                    if (right - left + 1 < minLen){
                        minLen = right - left + 1;
                        minLeftIndex = left;
                    }
                    char lc = s.charAt(left);
                    if (map.containsKey(lc)) {
                        map.put(lc, map.get(lc) + 1);
                        if (map.get(lc) > 0)  //move the left to find the next window.
                            missing++;
                    }
                    left++;
                }
            }
        }
        if (minLen > s.length()) {
            return "";
        }
        return s.substring(minLeftIndex, minLeftIndex + minLen);
    }

}
