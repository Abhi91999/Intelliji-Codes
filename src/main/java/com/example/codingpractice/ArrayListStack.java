package com.example.codingpractice;

import java.util.ArrayList;

public class ArrayListStack {
    static class Stack{
        static ArrayList<Integer> li = new ArrayList<>();
        public static boolean isEmpty()
        {
            return li.size() == 0;
        }
        public static void push(int data)
        {
            li.add(data);
        }
        public static int pop()
        {
            if(isEmpty())
            {
                return -1;
            }
            int top = li.get(li.size()-1);
            li.remove(li.size()-1);
            return top;
        }
        public static int peek(){
            if(isEmpty())
            {
                return -1;
            }
            return li.get(li.size()-1);
        }
    }
    public static void main(String[] args) {
    Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
