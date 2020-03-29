package com.leetcode;

import java.util.*;

public class L047_Permutation_II {

    public static void main(String args[]){

        int[] arr= {1,3,1,1,2};

        List<List<Integer>> result = permuteUnique(arr);
        Set<List<Integer>> set = new HashSet<>();
        for(List<Integer> list: result){
            if(!set.add(list)){
                System.out.println(list);
            }
        }

    }

    private static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        Arrays.sort(nums);
        for(int num: nums){
            cur.add(num);
        }
        int index = 0;
        helper(cur, index,result);
        return result;
    }

//    private static void helper(List<Integer> cur, int index, List<List<Integer>> result) {
//        if(index == cur.size()-1){
//            result.add(new ArrayList<>(cur));
//            return;
//        }
//        Set<Integer> set = new HashSet<>();
//        for(int i = index; i< cur.size(); i++){
//            if(!set.contains(cur.get(i))){
//                set.add(cur.get(i));
//                Collections.swap(cur, index,i);
//                System.out.println(index+1);
//                helper(cur, index+1, result);
//                Collections.swap(cur, index,i);
//            }
//        }
//    }
private static void helper(List<Integer> cur, int index, List<List<Integer>> result) {
    if(index == cur.size()-1){
        result.add(new ArrayList<>(cur));
        return;
    }

    for(int i = index; i< cur.size(); i++){
        if(i > index && cur.get(i)==cur.get(i-1)) {
            continue;
        }

            Collections.swap(cur, index,i);
            helper(cur, index+1, result);
            Collections.swap(cur, index,i);

    }
}

}
