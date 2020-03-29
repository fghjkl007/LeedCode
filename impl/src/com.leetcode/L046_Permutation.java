package com.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class L046_Permutation {
    public static void main(String args[]){

        int[] arr= {1,2,3};

        List<List<Integer>> result = permute(arr);
        Set<List<Integer>> set = new HashSet<>();
        for(List<Integer> list: result){
            if(!set.add(list)){
                System.out.println(list);
            }
        }

    }

    private static List<List<Integer>> permute(int[] arr) {
        List<Integer> numsList = Arrays.stream(arr).boxed().collect(Collectors.toList());

        List<List<Integer>> result = new ArrayList<>();
        permute(numsList, 0, result);

        return result;
    }

    public static void permute(List<Integer> numsList, int start, List<List<Integer>> result) {
        if (start == numsList.size()) {
            result.add(numsList);
        } else {
            for (int i = start; i < numsList.size(); i++){
                List<Integer> newList = new ArrayList<>(numsList);
                Collections.swap(newList, start, i);
                permute(newList, start + 1, result);
            }
        }
    }

}
