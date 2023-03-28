package com.example.codingpractice;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionofTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        if(nums1.length < nums2.length){
            for(int i = 0; i < nums1.length; i++){
                if(i > 0 && nums1[i] == nums1[i - 1]) continue;
                if(search(nums1[i], nums2)){
                    ans.add(nums1[i]);
                }
            }
        }
        else {
            for(int j = 0; j < nums2.length; j++){
                if(j > 0 && nums2[j] == nums2[j - 1]) continue;
                if(search(nums2[j], nums1)){
                    ans.add(nums2[j]);
                }
            }
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
    public static boolean search(int i, int[] num) {
        int high = num.length - 1;
        int low = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = num[mid];
            if (guess == i) return true;
            else if (guess > i) high = mid - 1;
            else low = mid + 1;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums1 = {4,9,5,4,4};
        int[] nums2 = {9,4,9,8,4};
//        IntersectionofTwoArrays ia = new IntersectionofTwoArrays();
        int[] a = intersection(nums1,nums2);
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

    }
}
