package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class L217_Contains_Duplicate {
    public static void main(String args[]){
       int[] input = {1,2,3,1};
       System.out.println(containsDuplicate(input));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            if( ! set.add(num)){
                return true;
            }
        }
        return false;

    }
}
