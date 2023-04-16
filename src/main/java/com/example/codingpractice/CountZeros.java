package com.example.codingpractice;

public class CountZeros {
    public static void main(String[] args) {
        int[] arr = new int[]{0,0,1,1,0,0,0,0,0,0,0,0,0,1};
        int count = 0;
        int totalSubArrays = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                count++;
            }else{
                totalSubArrays = totalSubArrays+ (count *(count+1)/2);
                count = 0;
            }
        }
        if(count != 0){
            totalSubArrays = totalSubArrays+ (count *(count+1)/2);
        }
        System.out.println(totalSubArrays);
//        long ans=0;
//        long count=0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==0){
//                count++;
//            }else{
//                ans+=(count*(count+1))/2;
//                count=0;
//            }
//        }
//
//        ans+=(count*(count+1))/2;
//        System.out.println(ans);
    }
        //Arrays.stream(arr).forEach(System.out::println);
    }
