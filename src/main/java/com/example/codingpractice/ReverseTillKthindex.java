package com.example.codingpractice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseTillKthindex {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        System.out.println(q);
        for(int i=0; i<3; i++) {
            s.add(q.remove());
        }
        System.out.println(s);
        while(!s.isEmpty())
        {
            q.add(s.pop());

        }
        System.out.println(q);
        for(int i =0; i<3; i++)
        {
            q.add(q.remove());
        }
        System.out.println(q);

    }
}
