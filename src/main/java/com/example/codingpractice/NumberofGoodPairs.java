package com.example.codingpractice;

import java.util.HashMap;

public class NumberofGoodPairs {
    public static void main(String[] args) {

        int nums[] = {1, 2, 3, 1, 1, 3};
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int ans = 0;
        for (int i : nums) {
            if (map.containsKey(i)) {
                int temp = map.get(i);
                ans += temp;
                map.put(i, temp + 1);
            } else {
                map.put(i, 1);
            }
        }
    }
}

