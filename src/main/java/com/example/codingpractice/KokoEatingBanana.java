package com.example.codingpractice;

public class KokoEatingBanana {
    public static void main(String[] args) {
        int piles[] = {3,6,7,11};
        int h = 8;
        int low = 1,high=0;
        for(int i=0;i<piles.length;i++)
            high = Math.max(piles[i],high);
        System.out.println(high);
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            if(possible(piles,mid,h))
                high = mid-1;
            else low = mid+1;
        }
        System.out.println(low);
    }
    static boolean possible(int[] piles,int speed,int hours)
    {
        int res = 0;
        for(int i=0;i<piles.length;i++)
        {
            res += (piles[i]/speed);
            if(piles[i]%speed != 0)
                res++;
        }
        return res <= hours;
    }
}
