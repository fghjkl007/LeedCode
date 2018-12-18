package com.leetcode;

import java.util.Arrays;

public class L283_Move_Zeroes {
    public static void main(String args[]){
        int[] input = {1,1,0,3,0,12};
        moveZeroes(input);
        Arrays.stream(input).forEach(System.out::println);
    }

    public static void moveZeroes(int[] nums) {
        for(int i =0, j=0;i<nums.length; i++){
            if(nums[i]!=0){
                if(j<i){
                    nums[j] = nums[i];
                    nums[i] = 0;
                }
                j++;
            }
        }
    }
}
