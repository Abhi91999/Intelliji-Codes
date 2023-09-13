package com.example.codingpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram1 {
    public static void main(String[] args) {
        String strs[] = {"eat","tea","tan","ate","nat","bat"};
        HashMap<String , ArrayList<String>> hashmap = new HashMap<>();
        List<String> arr = new ArrayList<>();
        for (String s : strs)
        {
            char chars[] = s.toCharArray();
            Arrays.sort(chars);
            String s2 = new String(chars);

            arr = hashmap.computeIfAbsent(s2, key -> new ArrayList<>());
            arr.add(s);
        }

            System.out.println(hashmap);


//        return new ArrayList<>(hashmap.values());
    }
}
