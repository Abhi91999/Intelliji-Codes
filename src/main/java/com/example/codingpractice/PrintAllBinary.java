package com.example.codingpractice;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
public class PrintAllBinary {
    public static void main(String[] args) {
        int n = 101;
        BinaryCreate(n);
    }

    private static void BinaryCreate(int n) {
        ArrayList<String> li = new ArrayList<>();
        Queue<String> q = new LinkedList<>();
        q.add("1");
        int i = 1;
        while(i++ <=n)
        {
            q.add(q.peek() + '0');
            q.add(q.peek() + '1');
            li.add(q.remove());
        }
        System.out.println(li);
    }
}
