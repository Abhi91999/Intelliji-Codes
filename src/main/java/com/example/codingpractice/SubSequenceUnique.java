package com.example.codingpractice;

import java.util.HashSet;

public class SubSequenceUnique {
    public static void subSequenceUnique(String str, int idx, String newString, HashSet<String> set)
    {
        if(idx == str.length())
        {
            if(set.contains(newString))
            {
                return;
            }
            else
            {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char ch = str.charAt(idx);
        subSequenceUnique(str, idx+1, newString+ch, set);
        subSequenceUnique(str, idx+1, newString, set);

    }
    public static void main(String[] args) {
        String str = "aaaaaaa";
        HashSet<String> set = new HashSet<>();
        subSequenceUnique(str, 0, "",set);

    }
}
