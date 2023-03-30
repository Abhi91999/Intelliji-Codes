package com.example.codingpractice;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {
    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
        int n = 3;
        String tem = "(";
        generate(tem, 1, 0, n);
        System.out.println(result);
    }
    public static void generate(String s, int open, int close, int n) {
        List<String> result = new ArrayList<>();
        if (s.length() == 2 * n) {
            result.add(s);
            return;
        }

        if (open < n) generate(s + "(", open + 1, close, n);
        if (close < open) generate(s + ")", open, close + 1, n);

    }
}


