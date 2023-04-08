package com.example.codingpractice;

import java.util.*;

public class FirstNegativeInteger {
    public static void main(String[] args) {
        int[] A = {-8, 2, 3, -6, 10};
        int K=2;
        int N = 5;
        int[] res = printFirstNegativeInteger(A,N,K);
        for(int i=0;i<res.length;i++)
        {
            System.out.println(res[i]);
        }
    }
    public static int[] printFirstNegativeInteger(int A[], int N, int K)
    {
        int[] result = new int[N-K+1];
        int idx =0;
        int windowStart =0;
        int windowEnd =0;
        Queue<Integer> q = new LinkedList<>();
        for(windowEnd=0; windowEnd<N; windowEnd++)
        {
            if(A[windowEnd] < 0)
            {
                q.add(A[windowEnd]);
            }
            if(windowEnd - windowStart +1 == K)
            {
                if(q.isEmpty())
                {
                    result[idx++] = 0;
                }
                else
                {
                    int num = q.peek();
                    result[idx++] = num;
                    if(num == A[windowStart])
                    {
                        q.remove();
                    }
                }
                windowStart++;
            }
        }
        return result;
    }
}
