package com.leetcode.extra;

import java.util.Arrays;

public class Reloate {
    public static void main(String args[]){
        int[] input = {0,1,0,0,1,1,1,0,1,1,1,0,0,0,0, 3};

        method(input);

       // Arrays.stream(input).forEach(System.out::println);

        int max= Arrays.stream(input).max().getAsInt();
        System.out.println();
    }

    private static void method(int[] input) {
        int start = 0;
        int end = input.length-1;

        while(start+1<end){
            if(input[start]==1){
                int temp = 0;
                temp = input[end];
                input[end] = input[start];
                input[start] = temp;
                end--;
            }
            if(input[start]!=1){
                start++;
            }

        }
    }
}
