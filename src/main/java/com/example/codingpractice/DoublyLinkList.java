package com.example.codingpractice;

public class DoublyLinkList {
    public static void main(String[] args) {
        DoublyLink list = new DoublyLink();
        list.insertAtEnd(1);
        list.insertAtEnd(4);
        list.insertAtEnd(6);

        list.Display();

    }
}
class Node{
    int data;
    Node prev;
    Node next;
    public Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
class DoublyLink{
    Node head;
    Node tail;
    public void insertAtEnd(int newData)
    {
        Node newNode = new Node(newData);
        if(head == null)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    public void Display()
    {
        Node current = head;
        while(current != null)
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
