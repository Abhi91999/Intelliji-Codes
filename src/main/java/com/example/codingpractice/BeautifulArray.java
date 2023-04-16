package com.example.codingpractice;

import java.util.ArrayList;
import java.util.Stack;

public class BeautifulArray {
    public static void main(String[] args) {
        int[] arr= new int[]{4,5,6,-1,-2,9,7};
        ArrayList<Integer> li = beautifulArrayCheck(arr);
        for(int i=0; i<li.size();i++)
        {
            System.out.println(li.get(i));
        }
    }

    private static ArrayList<Integer> beautifulArrayCheck(int[] arr) {
        Stack<Integer> s = new Stack<>();
        ArrayList<Integer> li = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!s.isEmpty() && s.peek() >= 0 && arr[i] <0)
            {
                s.pop();
            }
            else if(!s.isEmpty() && s.peek() < 0 && arr[i] >=0)
            {
                s.pop();
            }
            else {
                s.push(arr[i]);
            }
        }
        while(!s.isEmpty())
        {
            li.add(s.peek());
            s.pop();
        }
        return li;


//        nt [] arr = {1,2,-2,3};
//        for(int i =0; i<arr.length; i++){
//           if(stack.isEmpty()){
//              stack.push(arr[i]);
//           }else{
//              if(stack.peek() * arr[i] < 0){
//                  stack.pop();
//              }else{
//                  stack.push(arr[i]);
//              }
//           }
//        }
//        return stack.arr;
//        int[] arr = new int[]{ 4,2,-2,1 };
//        Stack<Integer> s=new Stack<>();
//        s.push(arr[0]);
//        for(int i=1;i<arr.length;i++){
//            if(s.isEmpty()){
//                s.push(i);
//            }
//            if(s.peek()>0 && arr[i]>0){
//                s.push(arr[i]);
//            }else if(s.peek()<0 && arr[i]<0){
//                s.push(arr[i]);
//            }else{
//                s.pop();
//            }
//        }

    }
}
