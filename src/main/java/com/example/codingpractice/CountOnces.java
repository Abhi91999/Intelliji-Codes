package com.example.codingpractice;

public class CountOnces {
    public static void main(String[] args) {
                int nums[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0};
                int target =0;
                int[] result = new int[2];
                int sum = 0;
                result[0] = findIndx(nums, target, true);
                result[1] = findIndx(nums, target, false);
                System.out.println(result[0]);
                System.out.println(result[1]);
                for(int i =result[0];i<result[1];i++) {
                    sum += nums[i];
                    System.out.println("The sum is "+sum);
                }
        System.out.println(sum);
            }
            private static int findIndx(int[] nums, int target, boolean findFirstVal)
            {
                int start = 0;
                int end = nums.length-1;
                int mid =0;
                int idx = -1;
                while(start <= end)
                {
                    mid = start + (end-start)/2;
                    if(nums[mid] == target)
                    {
                        idx = mid;
                    }
                    if(findFirstVal == true)
                    {
                        if(nums[mid] <= target)
                        {
                            end = mid-1;
                        }
                        else
                        {
                            start = mid+1;
                        }
                    }
                    else
                    {
                        if(nums[mid] >= target)
                        {
                            start = mid +1;
                        }
                        else
                        {
                            end = mid - 1;
                        }
                    }
                }
                return idx;
            }
        }


