package com.example.codingpractice;
import java.util.HashSet;

import static com.example.codingpractice.LinkedListUnion.unionOfList;

public class UnionofTwoLinkedList {
    public static void main(String[] args) {
        Node list1= new Node(1);
        list1.next = new Node(2);
        list1.next.next = new Node(3);

        Node list2 = new Node(2);
        list2.next = new Node(3);
        list2.next.next = new Node(4);

        Node unionList = unionOfList(list1,list2);
        printLinkedList(unionList);
    }
    private static Node sortedInsert(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null || data < head.data) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null && current.next.data < data) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }

        return head;
    }
    public static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}


class LinkedListUnion
{
    Node head;
    public LinkedListUnion(){
        this.head = null;
    }
    public static Node unionOfList(Node list1, Node list2)
    {
        HashSet<Integer> uniqueElement = new HashSet<>();
        Node current = list1;
        while(current != null)
        {
            uniqueElement.add(current.data);
            current = current.next;
        }
        current = list2;
        while(current != null)
        {
            uniqueElement.add(current.data);
            current = current.next;
        }

        Node resultedHead = null;
        for(int element : uniqueElement)
        {
            Node newNode = new Node(element);
            newNode.next = resultedHead;
            resultedHead = newNode;
        }
        return resultedHead;
    }
}
