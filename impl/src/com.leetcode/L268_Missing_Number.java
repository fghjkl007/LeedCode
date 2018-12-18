package com.leetcode;

public class L268_Missing_Number {
    public static void main(String args[]){
        int[] input = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(input));
    }

    public static int missingNumber(int[] nums) {
        int sum = (nums.length+1)*nums.length/2;
        for(int num : nums){
            sum-=num;
        }
        return sum;
    }
}
