package com.example.codingpractice;

import java.util.HashMap;

public class CountVowel {
    private boolean isVowel(char ch) {

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
            return true;
        }

        return false;
    }

    public int maxVowels(String s, int k) {

        //Initial check length of k is greater then length of string then answer is 0.
        if(k > s.length()) {
            return 0;
        }

        int res = 0;

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        //Number of vowel count in the current window ( in our case substring of length K ) of size K
        int vowelCount = 0;

        //To ensure that we reach to the substring of length k
        int length = 0;

        //Useful for removing the elements from the start once we reach the window of k length
        int pos = 0;

        for(int i=0; i<s.length(); i++) {

            if(map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }else {
                map.put(s.charAt(i),1);
            }

            //check whether the current character is vowel or not
            if(isVowel(s.charAt(i))) {
                vowelCount++;
            }

            length++;

            // if length of the window crossed k then we have to remove the first character from the window with help of variable pos
            if(length > k) {

                map.put(s.charAt(pos), map.get(s.charAt(pos)) - 1);

                // if character we are removing is also a vowel then we have to reduce the vowel count as this character is no
                // more part of the current window of size k
                if(isVowel(s.charAt(pos))) {
                    vowelCount--;
                }
                pos++;
                length--;
            }

            // if length of the present window reaches the length k then find the vowel count in this window
            if(length == k) {
                res = Math.max(res, vowelCount);
            }

            // if all the elements in the window are vowel it means we reached max answer we don't have to go further
            // Example s = "aaaadaaaa" k = 4 then maximum possible answer achieved in window 0 to 3 ( 0 based indexing ) no need check further
            if(res == k){
                return k;
            }
        }

        return res;

    }

}
