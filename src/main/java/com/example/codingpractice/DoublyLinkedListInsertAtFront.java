package com.example.codingpractice;

public class DoublyLinkedListInsertAtFront {
    public static void main(String[] args) {
        DoublyList list = new DoublyList();
        list.insertAtFront(1);
        list.insertAtFront(10);
        list.insertAtFront(0);
        list.insertAtFront(18);
        list.Display();
    }
}
class Nodde{
    int data;
    Nodde prev;
    Nodde next;
    public Nodde(int data)
    {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
class DoublyList{
    Nodde tail;
    Nodde head;
    public void insertAtFront(int newData)
    {
        Nodde newNode = new Nodde(newData);
        newNode.next = head;
        if(head != null)
        {
            head.prev = newNode;
        }
        head= newNode;

    }
    public void Display()
    {
        Nodde current = head;
        while(current != null)
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

}