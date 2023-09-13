package com.example.codingpractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashCheckTest {
    public static void main(String[] args) {
        HashMap<Character, List<Integer>>  map = new HashMap<>();
        String s ="ababa";
        for(int i=0; i< s.length(); i++)
        {
            char key = s.charAt(i);
            if(map.containsKey(key)) {
                List<Integer> temp = map.get(key);
                temp.add(i);
                map.put(key,temp);
            }
            else
            {
                List<Integer> li = new ArrayList<>();
                li.add(i);
                map.put(s.charAt(i),li);
            }

        }
        System.out.println(map);
    }
}
