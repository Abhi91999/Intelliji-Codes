package com.example.codingpractice;


import java.util.HashMap;
import java.util.Map;

public class NumberOfPairWithAbsoluteDifference {
    public static void main(String[] args) {
        int[] nums = {1,2,2,1};
        int k = 1;
        HashMap<Integer,Integer> map = new HashMap<>();
        int res = 0;

        for(int i = 0;i< nums.length;i++){
            if(map.containsKey(nums[i]-k)){
                res+= map.get(nums[i]-k);
            }
            if(map.containsKey(nums[i]+k)){
                res+= map.get(nums[i]+k);
            }
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        System.out.println(res);
    }
}
