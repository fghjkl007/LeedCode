package com.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class L169_Majority_Element {

    public static void main(String args[]){
        int[] input = {3,3,4};
        int result = majorityElement(input);
        System.out.println(result);
    }

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
