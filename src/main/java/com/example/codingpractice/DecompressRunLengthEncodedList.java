package com.example.codingpractice;

import java.util.Arrays;

public class DecompressRunLengthEncodedList {
    public static void main(String[] args) {
        int nums[] = {1,1,2,3};
        int arrSize = 0;
        for (int i = 0; i < nums.length; i += 2) {
            arrSize += nums[i];
        }

        int[] result = new int[arrSize];

        int startIdx = 0;
        for (int i = 0; i < nums.length; i += 2) {
            Arrays.fill(result, startIdx, startIdx + nums[i], nums[i + 1]);
            startIdx += nums[i];
        }
    }
}
