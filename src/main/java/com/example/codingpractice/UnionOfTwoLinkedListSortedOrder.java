package com.example.codingpractice;

import java.util.HashSet;
import java.util.LinkedList;

public class UnionOfTwoLinkedListSortedOrder {
    public static void main(String[] args) {
        Node1 list1 = new Node1(1);
        list1.next = new Node1(2);
        list1.next.next = new Node1(3);

        Node1 list2 = new Node1(1);
        list2.next = new Node1(5);
        list2.next.next = new Node1(3);

        Node1 uniqueEle = LinkedList.getUniqueEle(list1, list2);
        new LinkedList().head = uniqueEle;
        new LinkedList().printLinkedList();
    }
    static class LinkedList {
        Node1 head;
        public void printLinkedList() {
            Node1 current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
        public static Node1 getUniqueEle(Node1 list1, Node1 list2) {
            HashSet<Integer> uniqueData = new HashSet<>();
            Node1 current = list1;
            while (current != null) {
                uniqueData.add(current.data);
                current = current.next;
            }
            current = list2;
            while (current != null) {
                uniqueData.add(current.data);
                current = current.next;
            }
            Node1 resultHead = null;
            for (int element : uniqueData) {
                resultHead = sortedInserted(resultHead, element);
            }
            return resultHead;
        }
        public static Node1 sortedInserted(Node1 head, int data) {
            Node1 newNode = new Node1(data);
            if (head == null || data < head.data) {
                newNode.next = head;
                head = newNode;
            } else {
                Node1 current = head;
                while (current.next != null && current.next.data < data) {
                    current = current.next;
                }
                newNode.next = current.next;
                current.next = newNode;
            }
            return head;
        }
    }
}
class Node1{
    int data;
    Node1 next;
    public Node1(int data){
        this.data = data;
        this.next = null;
    }
}
