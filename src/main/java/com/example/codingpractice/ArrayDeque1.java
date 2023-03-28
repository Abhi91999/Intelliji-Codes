package com.example.codingpractice;

import java.util.ArrayDeque;

import static java.lang.Long.sum;

/**
 * Creating a java doc for this package
 * @author AbhishekKumar
 * @version 0.1
 * @see <a href = "https://stackoverflow.com/questions/5920135/printing-hashmap-in-java"> Java Docs </a>
 */


public class ArrayDeque1 {
    public void Sum(int a,int b)
    {
        System.out.println("Sum ="+ a+b );
    }
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(25);
        ad1.add(56);
        ad1.add(69);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
        sum(6,6);
    }
}
