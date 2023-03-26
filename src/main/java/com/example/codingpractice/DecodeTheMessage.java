package com.example.codingpractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DecodeTheMessage {
    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        HashMap<Character,Character> map = new HashMap<>();
        char[] alphabet = new char[26];
        for(int i=0;i<26;i++)
        {
            alphabet[i] = (char)('a'+i);
        }
        int j=0;
        int keyLength = key.length();
        int messageLength = message.length();
        for(int k=0;k<keyLength;k++)
        {
            System.out.println(key.charAt(k));
            if(key.charAt(k) != ' ' && !map.containsValue(key.charAt(k)))
            {
                map.put(alphabet[j],key.charAt(k));
                j++;
            }
        }
        System.out.println(Arrays.asList(map));
        System.out.println(Arrays.asList(map.entrySet()));
        StringBuilder bs = new StringBuilder();
        for(int i=0;i<messageLength;i++)
        {
            if(!map.containsValue(message.charAt(i)))
            {
                bs.append(message.charAt(i));
                System.out.println(message.charAt(i));
            }
            else
            {
                for(Entry<Character,Character> entry : map.entrySet())
                {
                    if(entry.getValue()==message.charAt(i))
                    {
                        bs.append(entry.getKey());
                    }
                }
            }
        }
        System.out.println(bs.toString());
    }
}
