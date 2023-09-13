package com.example.codingpractice;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeInOrd {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class Binarytree{
        static int idx = -1;
        public static Node buildTree(int[] nodes)
        {
            idx++;
            if(nodes[idx] == -1)return null;
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }
    public static void preOrder(Node root){
        if(root == null)
        {
            //System.out.print("-1" +" ");
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(Node root)
    {
        if(root == null)
        {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    public static void postOrder(Node root)
    {
        if(root == null)
        {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
    public static void levelOrder(Node root)
    {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            Node currNode = q.remove();
            if(currNode == null)
            {
                System.out.println();
                {
                    if(q.isEmpty())
                    {
                        break;
                    }
                    else {
                        q.add(null);
                    }
                }
            }
            else {
                System.out.print(currNode.data + " ");
                if(currNode.left != null)
                {
                    q.add(currNode.left);
                }
                if(currNode.right != null)
                {
                    q.add(currNode.right);
                }
            }
        }
    }
    public static int countNode(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        int leftNode = countNode(root.left);
        int rightNode = countNode(root.right);
        return leftNode + rightNode +1;
    }
    public static int sumOfNodes(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
        return leftSum + rightSum + root.data;
    }
    public static int heightNode(Node root)
    {
        if(root == null){return 0;}
        int leftHeight = heightNode(root.left);
        int rightHeight = heightNode(root.right);

        int myHeight = Math.max(leftHeight , rightHeight) +1;
        return myHeight;
    }
    public static int diameterTree(Node root)
    {
        if(root == null){return 0;}
        int diaMeter1 = diameterTree(root.left);
        int diaMeter2 = diameterTree(root.right);
        int diaMeter3 = heightNode(root.left) + heightNode(root.right) + 1;
        return Math.max(diaMeter3, Math.max(diaMeter1, diaMeter2));
    }
    static class treeInfo{
        int ht;
        int diam;
        treeInfo(int ht, int diam)
        {
            this.ht = ht;
            this.diam = diam;
        }
    }
    public static treeInfo diameterCheck(Node root){
        if(root == null)
        {
            return new treeInfo(0,0);
        }
        treeInfo left = diameterCheck(root.left);
        treeInfo right = diameterCheck(root.right);
        int myHeight = Math.max(left.ht, right.ht) +1;
        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht  +1;

        int mydiam = Math.max(Math.max(diam1, diam2), diam3);
        treeInfo newtreeInfo = new treeInfo(myHeight, mydiam);
        return newtreeInfo;
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree tree = new Binarytree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        levelOrder(root);
        System.out.println(countNode(root));
        System.out.println(sumOfNodes(root));
        System.out.println(heightNode(root));
        System.out.println(diameterTree(root));
        System.out.println(diameterCheck(root).diam);

    }
}
