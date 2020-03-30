package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class L051_N_Queens {

    public static void main(String args[]){
        System.out.println(solveNQueens(8));
    }

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> resultList = new ArrayList<>();
        int[] map = new int[n+1];
        backtrack(1, n, resultList, map);
        return resultList;
    }

    private static void backtrack(int t, int n, List<List<String>> resultList, int[] map) {
        for(int i=1;i<=n;i++){
            map[t]=i;
            if(valid(t, map)){
                if(t==n){
                    drawLine(n, resultList, map);
                }else{
                    backtrack(t+1,n, resultList, map);
                }
            }
        }
    }

    private static void drawLine(int n, List<List<String>> resultList, int[] map) {
        ArrayList<String> tempList = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < n; j++){
                sb.append(".");
            }
            sb.setCharAt(map[i]-1, 'Q');
            tempList.add(sb.toString());
        }
        resultList.add(tempList);
    }

    public static boolean valid(int t,int[] map){
        for(int i=1;i<t;i++){
            if(Math.abs(t-i)==Math.abs(map[t]-map[i])||map[i]==map[t]){
                return false;
            }
        }
        return true;
    }
}
