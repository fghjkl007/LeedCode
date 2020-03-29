package com.leetcode.extra;

import com.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class SumPathTree {

    private static List<Integer> listResult = new ArrayList<>();


    public static void main(String args[]){
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(9);
        root.left.left.left = new TreeNode(5);
        root.left.right.left = new TreeNode(6);
        root.right.right = new TreeNode(10);
        root.right.left = new TreeNode(1);

        Stack<Integer> stack = new Stack<>();
        List<Integer> result2 = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        pathSum(root,  18);

        listResult.stream().forEach(n -> sb.append(n).append("-"));
        System.out.println(sb.toString());
        String print = sb.toString().substring(0, sb.length()-1);
        System.out.println(print);

//        stackWay(root, stack, 18);
//        listResult.stream().forEach(System.out::print);
    }

    public static void pathSum(TreeNode root, int target) {
        if (root == null||!listResult.isEmpty()) return;
        List<Integer> path = new ArrayList<Integer>();
        dfs(root, path, target);
        pathSum(root.left, target);
        pathSum(root.right, target);

    }

    public static void dfs(TreeNode root, List<Integer> path, int target) {
        if (root == null||!listResult.isEmpty()) return;
        path.add(root.val);
        target-=root.val;
        if(target == 0&&root.left==null&&root.right==null){
            listResult.addAll(path);
        }else{
            dfs(root.left, path, target);
            dfs(root.right, path, target);
        }
        path.remove(path.size()-1);
    }




    public static void stackWay(TreeNode root, Stack<Integer> stack, int target) {
        if (root == null) return;
        stack.push(root.val);

        if(root.left==null&&root.right==null){
            determineIsPath(stack, target);
        }else{
            stackWay(root.left, stack, target);
            stackWay(root.right, stack, target);
        }

        if(!stack.isEmpty()){
            stack.pop();
        }

    }

    private static void determineIsPath(Stack<Integer> stack, int target){
        Stack<Integer> temp = new Stack<>();
        int size = stack.size();
        for(int i = 0; i<size; i++ ){
            temp.add(stack.pop());
            int sum = temp.stream().mapToInt(n -> n.intValue()).sum();
            if(sum<target){
                continue;
            }else if(sum==target){

                listResult.addAll(temp);
                break;
            }
        }
        Collections.reverse(stack);
        temp.stream().forEach(n -> stack.push(n));
    }





    private static void method(Stack<Integer> result, TreeNode root, int target, int sum) {
        if(sum + root.val == target){
            result.push(root.val);
            return;
        }else if(sum + root.val>target) {
            result.pop();
            return;
        }else if(sum + root.val< target){
            result.push(root.val);
            sum = sum + root.val;
            method(result, root.left, target, sum);
        }






    }


}
