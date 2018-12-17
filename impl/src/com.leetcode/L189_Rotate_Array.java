package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class L189_Rotate_Array {
    public static void main(String args[]){
        int[] input = {1,2};
        int k = 1;
        rotate(input,k);
        Arrays.stream(input).forEach(System.out::println);
    }

    public static void rotate(int[] nums, int k) {
        if(nums.length==1||k>=nums.length){
            return ;
        }
        k%=nums.length;
        reverseArray(nums, nums.length-k, nums.length-1);
        reverseArray(nums, 0, nums.length-k-1);
        reverseArray(nums, 0, nums.length-1);

    }

    private static void reverseArray(int[] nums, int start, int end){
        while(start<end){
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            start++;
            end--;
        }
    }

}
