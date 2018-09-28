package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class PrintTree {
    public static void print(TreeNode root){
     if(root!=null){
         Queue<TreeNode> list = new LinkedList<>();
         list.add(root);
         System.out.print(" ["+root.val+"] ");
         TreeNode curNode;
         while(!list.isEmpty()){
             curNode = list.remove();
             if(!(curNode.left==null&&curNode.right==null)){
                 if(curNode.left!=null){
                     System.out.print(" ["+curNode.left.val+"] ");
                     list.add(curNode.left);
                 }else {
                     System.out.print(" [null] ");
                 }
                 if(curNode.right!=null){
                     System.out.print(" ["+curNode.right.val+"] ");
                     list.add(curNode.right);
                 }else {
                     System.out.print(" [null] ");
                 }
             }
         }
     }
    }
}
