package com.example.codingpractice;

import java.util.ArrayDeque;
import java.util.Deque;

public class ShortestSubarraywithSumatLeastK {
    public static void main(String[] args) {
        int[] nums = new int[]{2,7,3,-8,4,10};
        int k=12;
        System.out.println(shortestSubarray(nums,k));
    }
    public static int shortestSubarray(int[] nums, int k) {
        int nLen = nums.length;
        int shortest = nLen + 1;

        // Building a prefix/cummulative sum of all elements
        long[] prefixSum = new long[nLen+1];
        for(int i=0; i < nLen; i++)
            prefixSum[i+1] = prefixSum[i] + nums[i];

        // Initialize the Deque for storing the starting indices
        Deque<Integer> startIdxs = new ArrayDeque<>();

        for(int i=0; i < nLen + 1; i++){
            // Finding the smallest window whose sum >= k
            while(!startIdxs.isEmpty() && prefixSum[i] - prefixSum[startIdxs.peek()] >= k)
                shortest = Math.min(shortest, i - startIdxs.poll());

            // Keeping the startIdxs deque in an order of increasing sequence
            while(!startIdxs.isEmpty() && prefixSum[i] <= prefixSum[startIdxs.peekLast()])
                startIdxs.pollLast();

            // Add the current index to the startIdxs queue
            startIdxs.add(i);
        }

        return shortest <= nLen ? shortest : -1;

    }
}

