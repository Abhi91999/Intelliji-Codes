package com.example.codingpractice;

import java.util.ArrayList;

public class MaxSumSubArrayOfSizeK {
    public static void main(String[] args) {
        int k = 2;
        ArrayList<Integer> Arr = new ArrayList<>();
        Arr.add(100);
        Arr.add(200);
        Arr.add(300);
        Arr.add(400);

        int N = Arr.size();
        System.out.println(maximumSumSubarray(k,Arr,N));


    }
    static long maximumSumSubarray(int k, ArrayList<Integer> Arr, int N) {
        // code here

        if (k == 0 || N == 0) {
            return 0;
        }

        int maxSum = Integer.MIN_VALUE;
        int windowStart = 0;
        int windowSum = 0;

        for (int windowEnd = 0; windowEnd < N; windowEnd++) {
            windowSum += Arr.get(windowEnd); // Add the next element to the window

            if (windowEnd - windowStart + 1 == k) {
                if (maxSum < windowSum)// When we hit the window size. Update maximum sum, and slide the window
                    maxSum = windowSum;
                windowSum -= Arr.get(windowStart); // Subtract the element going out of the window
                windowStart++; // Slide the window
            }
        }

        return maxSum;
    }
}
