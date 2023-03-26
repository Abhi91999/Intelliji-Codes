package com.example.codingpractice;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
            LinkedList<Integer> l1 = new LinkedList<>();
            LinkedList<Integer> l2 = new LinkedList<>();
            l2.add(5);
            l2.add(14);
            l2.add(18);
            l2.add(19);
            l1.add(20);
            l1.add(13);
            l1.add(0, 5);

            l1.set(1, 566);
            System.out.println(l1.contains(45));
            System.out.println(l1.indexOf(6));
            System.out.println(l1.lastIndexOf(6));
            for (int i = 0; i < l1.size(); i++) {
                System.out.println(l1.get(i));
                System.out.print(" ,");
                System.out.println(l2.get(i));
            }
    }
}
