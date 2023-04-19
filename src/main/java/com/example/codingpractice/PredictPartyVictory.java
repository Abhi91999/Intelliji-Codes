package com.example.codingpractice;

import java.util.LinkedList;
import java.util.Queue;

public class PredictPartyVictory {
    public static void main(String[] args) {
    String senate = "RD";
        System.out.println(PartyVictory(senate));
    }

    private static String PartyVictory(String senate) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        int n = senate.length();
        for(int i=0; i<n; i++)
        {
            if(senate.charAt(i) == 'R')
                q1.add(i);
            else
                q2.add(i);
        }
        for(;!q1.isEmpty() && !q2.isEmpty();)
        {
            int r = q1.poll();
            int d = q2.poll();
            if(r < d)
            {
                q1.add(r+n);
            }
            else {
                q2.add(d+n);
            }
        }
        return q1.size() < q2.size() ? "Dove" : "Radient";
    }

}
