package com.example.codingpractice;
import java.util.*;
public class countOccurancesofAnagram2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String word = sc.next();
        sc.close();
        System.out.printf("Count of anagram in the given text is %d%n",countOccurancesofAnagarm(text,word));
    }

    private static int countOccurancesofAnagarm(String text, String word) {
        int n = text.length();
        int k = word.length();
        int count = 0;
        Map<Character, Integer> wordCharCount = new HashMap<>();
        for (int i = 0; i < k; i++) {
            char c = word.charAt(i);
            wordCharCount.put(c, wordCharCount.getOrDefault(c, 0) + 1);
        }
        //for(int i=0; i<n-k+1; i++){
        Map<Character, Integer> subStrCount = new HashMap<>();
        int windowStart = 0, windowEnd = 0;
        for (; windowEnd < n; windowEnd++) {
            char c = text.charAt(windowEnd);
            subStrCount.put(c, subStrCount.getOrDefault(c, 0) + 1);

            if (windowEnd - windowStart + 1 == k) {
                if (isAnagramCheck(wordCharCount, subStrCount)) {
                    count++;
                }
                subStrCount.put(text.charAt(windowStart), subStrCount.get(text.charAt(windowStart)) - 1);
                windowStart++;
            }
        }

        return count;
    }

    private static boolean isAnagramCheck(Map<Character, Integer> wordCharCount, Map<Character, Integer> subStrCount) {
        for(char c : wordCharCount.keySet())
        {
            if(wordCharCount.get(c) != subStrCount.get(c))
            {
                return false;
            }
        }
        return true;
    }
}
