package com.example.codingpractice;

import java.util.StringTokenizer;

public class MaximumNumberofWordsFoundinSentences {
    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int max =0;
        for(String s : sentences)
        {
            max = Math.max(max , new StringTokenizer(s).countTokens());
        }
    }
}
