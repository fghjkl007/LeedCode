package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class L001_Two_Sum {
    public static void main(String args[]){
        int[] input = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(input, target);
        Arrays.stream(result).forEach(System.out::println);
    }

    private static int[] twoSum(int[] input, int target) {
        if(input==null||input.length<=1){
            return new int[2];
        }
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<input.length; i++){
            map.put(input[i], i);
        }

        for(int i = 0; i<input.length; i++){
            if(map.containsKey(target-input[i])&&map.get(target-input[i])!=i){
               return new int[]{i, map.get(target-input[i])};
            }
        }
        return null;
    }
}
