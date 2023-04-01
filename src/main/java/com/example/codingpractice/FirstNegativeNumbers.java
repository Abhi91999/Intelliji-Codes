package com.example.codingpractice;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FirstNegativeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int keyLength = sc.nextInt();

        sc.close();

        int[] firstNegativeNumbers = findFirstNegativeNumberInSubarrayOfSizeK(array, keyLength);
        for (int i = 0; i < firstNegativeNumbers.length; i++) {
            System.out.print(firstNegativeNumbers[i] + " ");
        }
        System.out.println();
    }

    private static int[] findFirstNegativeNumberInSubarrayOfSizeK(int[] array, int keyLength) {
        int n = array.length;
        int[] firstNegativeNumber = new int[n-keyLength+1];
        int idx =0;

        Queue<Integer> q = new LinkedList<>();
        int windowStart =0;
        for(int windowEnd=0; windowEnd<n; windowEnd++)
        {
            if(array[windowEnd] <0)
            {
                q.add(array[windowEnd]);
            }
            if(windowEnd-windowStart+1 == keyLength)
            {
                if(q.isEmpty())
                {
                    firstNegativeNumber[idx++] =0;
                }
                else {
                    int num = q.peek();
                    firstNegativeNumber[idx++] = num;
                    if (num == array[windowStart]) {
                        q.remove();
                    }
                }
                windowStart++;
        }

    }
        return firstNegativeNumber;
}
}
