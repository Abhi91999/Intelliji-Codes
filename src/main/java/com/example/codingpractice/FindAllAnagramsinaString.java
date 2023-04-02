package com.example.codingpractice;

import java.util.*;

public class FindAllAnagramsinaString {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(findAnagrams(s,p));
    }
    public static List<Integer> findAnagrams(String s, String p) {
        if(p.length() > s.length()){
            return new ArrayList<>();
        }
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0; i < p.length(); i++){
            map.put(p.charAt(i), map.getOrDefault(p.charAt(i), 0) + 1);
            count++;
        }
        int i = 0;
        int j = 0;
        List<Integer> ans = new ArrayList<>();
        while(j < s.length()){
            if(i > j){
                j++;
            }
            else if(j - i == p.length() || map.containsKey(s.charAt(j)) == false || map.get(s.charAt(j))==0){
                if(j - i == p.length()){
                    ans.add(i);
                }
                if(map.containsKey(s.charAt(i))){
                    map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                }
                i++;
            }
            else{
                map.put(s.charAt(j), map.get(s.charAt(j)) - 1);
                j++;
            }
        }
        if(j - i == p.length()){
            ans.add(i);
        }
        return ans;
    }

}
