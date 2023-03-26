package com.example.codingpractice;

public class CheckIfPanagram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        int[] map = new int[26];
        char[] charArray = sentence.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            map[ch - 'a']++;
        }
        for(int i=0;i<map.length;i++)
        {
            System.out.print(map[i] + " ");
        }
        for (int j = 0; j < map.length; j++) {
            int i = map[j];
            if (i == 0)
                System.out.println(false);
        }
        System.out.println(true);
    }
}
