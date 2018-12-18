package com.leetcode;

public class L219_Contains_Duplicate_II {
    public static void main(String args[]){
        int[] input = {1,2,3,1,2,3};
        int k = 2;
        System.out.println(containsNearbyDuplicate(input,k));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i = 0; i< nums.length; i++){
            for(int j = i+1; j<Math.min(i+k+1, nums.length); j++){
                if(nums[i]==nums[j]) return true;
            }
        }
        return false;
    }
}
