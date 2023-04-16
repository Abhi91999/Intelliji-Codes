package com.example.codingpractice;

public class CompareVersionNumbers {
    public static void main(String[] args) {
        String version1 = "1.01";
        String version2 = "1.001";
        System.out.printf("Compare Version %d%n",compareVersion(version1, version2));
    }

    private static int compareVersion(String version1, String version2) {
        String s1[]=version1.split("\\.");
        String s2[]=version2.split("\\.");
        int len=Math.max(s1.length,s2.length);
        int val1[]=new int[len];
        int val2[]=new int[len];
        for(int i=0;i<s1.length;i++)
            val1[i]=Integer.parseInt(s1[i]);
        for(int i=0;i<s2.length;i++)
            val2[i]=Integer.parseInt(s2[i]);
        for(int i=0;i<len;i++)
        {
            if(val1[i]>val2[i])
                return 1;
            if(val1[i]<val2[i])
                return -1;
        }
        return 0;
    }
}
