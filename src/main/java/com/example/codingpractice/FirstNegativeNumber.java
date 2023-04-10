package com.example.codingpractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FirstNegativeNumber {
    private static int[] findFirstNegativeNumberInSubarrayOfSizeK_BruteForce(int[] a, int k) {
        int n = a.length;
        int[] firstNegativeNumbers = new int[n - k + 1];
        int idx=0;
        Queue<Integer> q = new LinkedList<>();
        int windowStart=0, windowEnd=0;
        for(windowEnd=0; windowEnd<n;windowEnd++)
        {
            if(a[windowEnd] < 0)
            {
                q.add(a[windowEnd]);
            }
            if(windowEnd - windowStart +1 == k)
            {
                if(q.isEmpty())
                {
                    firstNegativeNumbers[idx++] = 0;
                }
                else
                {
                    int num = q.peek();
                    firstNegativeNumbers[idx++] = num;
                    if(num == a[windowStart])
                    {
                        q.remove();
                    }
                }
                windowStart++;
            }
        }
        return firstNegativeNumbers;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        int k = keyboard.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = keyboard.nextInt();
        }
        keyboard.close();
        //-8, 2, 3, -6, 10
        int[] firstNegativeNumbers = findFirstNegativeNumberInSubarrayOfSizeK_BruteForce(a, k);
        for (int i = 0; i < firstNegativeNumbers.length; i++) {
            System.out.print(firstNegativeNumbers[i] + " ");
        }
        System.out.println();
    }
}
