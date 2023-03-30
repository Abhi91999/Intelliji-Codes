package com.example.codingpractice;

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        String s = "()[]{}";
        Stack<Character> res = new Stack<>();
        if(s.length() % 2 == 0)
        {
            System.out.println(false);
        }
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
            {
                res.push(s.charAt(i));
            }
            else if(res.isEmpty())
            {
                System.out.println(false);
            }
            else if(res.peek() == '(' && s.charAt(i) == ')')
            {
                res.pop();
            }
            else if(res.peek() == '[' && s.charAt(i) == ']')
            {
                res.pop();
            }
            else if(res.peek() == '{' && s.charAt(i) == '}')
            {
                res.pop();
            }
            else
            {
                System.out.println(false);
            }
        }
        System.out.println(res.isEmpty());
    }
}
