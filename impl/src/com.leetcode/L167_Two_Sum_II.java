package com.leetcode;

import java.util.Arrays;

public class L167_Two_Sum_II {

    public static void main(String args[]){
        int[] input = {2,7,11,15};
        int[] result = twoSum(input, 9);
        Arrays.stream(result).forEach(System.out::println);
    }

    public static int[] twoSum(int[] numbers, int target) {
        if(numbers.length<1){
            return null;
        }

        int left = 0;
        int right = numbers.length-1;
        while(left<right){
            if(numbers[left]+numbers[right]<target){
                left++;
            }
            else if(numbers[left]+numbers[right]>target){
                right--;
            }
            else{
                int[] result = new int[2];
                result[0] = left+1;
                result[1] = right+1;
                return result;
            }
        }
        return null;
    }
}
