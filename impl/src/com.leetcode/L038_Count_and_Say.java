package com.leetcode;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class L038_Count_and_Say {
    public static void main(String args[]){
        int input = 3;
        String result = method(input);

        System.out.println(result);


    }

    private static String method(int input) {
       String init = "1";
       for(int i = 1; i<input; i++){
           init = countAndSay(init);
       }
       return init;
    }

    private static String countAndSay(String init) {
        char[] chars = init.toCharArray();
        String s = "";
        int count = 1;
        char last = chars[0];
        for(int i = 1; i<chars.length; i++){
            if(chars[i]!=last){
                s = s+count+last;
                count = 1;
                last = chars[i];
            }else{
                count++;
            }
        }
        s = s+count+last;
        return s;
    }

}
