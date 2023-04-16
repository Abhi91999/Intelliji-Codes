package com.example.codingpractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class findLengthOfLongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        sc.close();
        //System.out.printf("The maxLength without repetation is %d%n", longestSubStringWithoutRepetation(text));
        System.out.printf("Longest substring without repeating characters = %d%n", longestSubStringWithoutRepetation(text));

    }
    private static int longestSubStringWithoutRepetation(String text) {
        int startWindow = 0, endWindow = 0;
        int len = text.length();
        int maxSum = -1;
        Map<Character, Integer> map = new HashMap<>();
        for (; endWindow < len; endWindow++) {
            char c = text.charAt(endWindow);
            map.put(c, map.getOrDefault(c, 0) + 1);
            while (map.size() < endWindow - startWindow + 1) {
                char leftChar = text.charAt(startWindow);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                startWindow++;
            }
            if (map.size() == endWindow - startWindow + 1) {
                maxSum = Math.max(maxSum, endWindow - startWindow + 1);
            }

        }
        return maxSum;
    }

}
