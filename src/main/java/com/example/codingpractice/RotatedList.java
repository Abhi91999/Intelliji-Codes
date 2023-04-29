package com.example.codingpractice;

import java.util.LinkedList;
public class RotatedList {
    Node head;
    private int size;
    RotatedList()
    {
        this.size = 0;
    }

    class Node {
        String val;
        Node next;

        Node(String val) {
            this.val = val;
            this.next = null;
            size++;
        }
    }

    public void firstAdd(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void lastAdd(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    public void printList(){
        if(head == null)
        {
            System.out.println("The list is empty");
        }
        Node currNode = head;
        while(currNode != null)
        {
            System.out.print(currNode.val + "->");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }
    public void deleteFirst()
    {
        if( head == null) {
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }
    public void deleteLast()
    {
        if( head == null) {
            System.out.println("The list is empty");
            return;
        }
        size--;
        if(head.next == null)
        {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null)
        {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    public int getSize()
    {
        return size;
    }
    public void reverseIterate()
    {
        if(head == null || head.next == null)
        {
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while( currNode != null)
        {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }
    public Node reverseRecursive(Node head)
    {
        if(head == null || head.next == null) return  head;
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        RotatedList ll = new RotatedList();
        ll.firstAdd("a");
        ll.firstAdd("is");
        ll.lastAdd("abhi");
        ll.lastAdd("shek");
        ll.printList();
        ll.head = ll.reverseRecursive(ll.head);
        ll.printList();
    }
}
