package com.example.codingpractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ValidAnagram {
    public static void main(String[] args) {

        String str1 = "anagram";
        String str2 = "nagarama";
        if(str1.length() != str2.length()) System.out.println(false);
        char[] s = str1.toCharArray();
        char[] s1 = str2.toCharArray();
        Arrays.sort(s);
        Arrays.sort(s1);
        for(int i =0;i<s.length;i++)
        {
            if(s[i] != s1[i])
                System.out.println(false);
            else
                System.out.println(true);

        }

//        Set<Character> set = new HashSet();
//        Set<Character> set1 = new HashSet();
//        for(int i=0;i<str1.length();i++)
//        {
//            set.add(str1.charAt(i));
//        }
//        for(int i=0;i<str2.length();i++)
//        {
//            set1.add(str2.charAt(i));
//        }
//        System.out.println(set.equals(set1));
////        HashMap<Character, Integer> hmap1
//                = new HashMap<Character, Integer>();
//        HashMap<Character, Integer> hmap2
//                = new HashMap<Character, Integer>();
//
//        char arr1[] = str1.toCharArray();
//        char arr2[] = str2.toCharArray();
//
//        // Mapping first string
//        for (int i = 0; i < arr1.length; i++) {
//
//            if (hmap1.get(arr1[i]) == null) {
//
//                hmap1.put(arr1[i], 1);
//            }
//            else {
//                Integer c = (int)hmap1.get(arr1[i]);
//                hmap1.put(arr1[i], ++c);
//                //System.out.println(hmap1.put(arr1[i], ++c));
//            }
//        }
//
//        // Mapping second String
//        for (int j = 0; j < arr2.length; j++) {
//
//            if (hmap2.get(arr2[j]) == null)
//                hmap2.put(arr2[j], 1);
//            else {
//
//                Integer d = (int)hmap2.get(arr2[j]);
//                hmap2.put(arr2[j], ++d);
//            }
//        }

//        if (hmap1.equals(hmap2))
//            System.out.println(true);
//        else
//            System.out.println(false);
    }
}
