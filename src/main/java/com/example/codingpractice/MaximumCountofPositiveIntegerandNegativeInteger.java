package com.example.codingpractice;

public class MaximumCountofPositiveIntegerandNegativeInteger {
    public static void main(String[] args) {
        int[] nums = {-3,-2,-1,0,0,1,2};
        int count = 1;
        int res=0;
        int start =0;
        int end = nums.length-1;

        if(nums[start] ==0 && nums[end] == 0) System.out.println(0);

        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid] == 0){
                if(mid !=0 && nums[mid-1] ==0){
                    int i = mid-1;
                    while(i>= 0 && nums[i] == 0) {
                        count++;
                        i--;
                    }
                }

                if(mid !=nums.length - 1 && nums[mid+1] ==0){
                    int i = mid+1;
                    while(i<= nums.length - 1  && nums[i] == 0){
                        count++;
                        i++;
                    }
                }

                int pos = nums.length - count - mid;
                int neg = nums.length - count - pos;
                res = Math.max(pos,neg);
                System.out.println(res);
            }

            if(nums[mid] > 0){
                start = mid -1;
            } else{
                end = mid+1;
            }
        }

        int neg = nums.length -end;
        int pos = nums.length - neg;
        res = Math.max(neg ,pos);
        System.out.println(res);
    }
}
