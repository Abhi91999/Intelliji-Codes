package com.example.codingpractice;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        int minLength = strs[0].length();
        int ansIndex = 0;
        if (strs.length == 1)
            return strs[0];

        for (int i = 1; i < strs.length; i++)
            minLength = Math.min(minLength, strs[i].length());

        for (int i = 0; i < minLength; i++) {

            for (int j = 0; j < strs.length - 1; j++) {
                if (strs[j].charAt(i) != strs[j + 1].charAt(i)) {
                    return strs[0].substring(0, i);
                }
                ansIndex = i + 1;
            }
        }
        return strs[0].substring(0, ansIndex);
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String result = longestCommonPrefix((strs));
        System.out.println(result);
    }
}
