package com.example.codingpractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryRep {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        ArrayList<String> arr = new ArrayList<>();
        int N = 5;
        int i = 0;
        q.add("1");
        while(i < N)
        {
            String res = q.remove();
            arr.add(res);
            q.add(res + "0");
            q.add(res + "1");
            i++;
        }

             System.out.println(arr);

    }
}
