package com.example.codingpractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMap1 {
    public static void main(String[] args) {
        String s = "ababacdcccsabcdbbascbssdddarffbaaas";
        Map<Character, List<Integer>> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            Character key = s.charAt(i);
            List<Integer> tempList = map.get(key);
              tempList.add(i);
            List<Integer> temp = new ArrayList<>();
                temp.add(i);
//            if(map.containsKey(key))
//            {
//                List<Integer> tempList = map.get(key);
//                tempList.add(i);
//                map.put(key,tempList);
//            }
//            else
//            {
//                List<Integer> temp = new ArrayList<>();
//                temp.add(i);
//                map.put(s.charAt(i),temp);
//            }
            map.getOrDefault(map.put(key,tempList),tempList);
        }
        System.out.println(map);
    }
}
