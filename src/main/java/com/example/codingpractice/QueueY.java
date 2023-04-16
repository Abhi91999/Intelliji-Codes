package com.example.codingpractice;

public class QueueY {
    public static class Queue{
        static int[] arr;
        static int size;
        static int rear = -1;
        static int front = -1;

        Queue(int size)
        {
            arr = new int[size];
            this.size = size;
        }
        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }
        public static boolean isFull(){
            return (rear+1)%size == front;
        }
        //Enqueue
        public static void add(int data)
        {
            //if(rear == size-1)
            if(isFull())
            {
                System.out.println("full Queue");
                return;
            }
            //1st element
            if(front == -1)
            {
                front = 0;
            }
            rear = (rear+1) % size;
            arr[rear] = data;
        }
        //Dequeue = O(n)
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("Empty Queue");
                return -1;
            }
            int result = arr[front];
            // single element condition
            if(rear == front)
            {
                rear = front = -1;
            }
            else
            {
                front = (front+1)%size;
            }
            return result;
        }
        //Peek()
        public static int peek(){
            if(isEmpty())
            {
                System.out.println("Empty Queue");
                return -1;
            }
            //return arr[0];
            return arr[front];
        }

    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(15);
        q.add(10);
        q.add(5);
        q.add(99);
        q.add(49);
        System.out.println(q.remove());
        System.out.println(q.remove());
        q.add(45);
        q.add(65);
        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }

    }
}
