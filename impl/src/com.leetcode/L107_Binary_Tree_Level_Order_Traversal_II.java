package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class L107_Binary_Tree_Level_Order_Traversal_II {
    public static void main(String args[]){
        TreeNode one = new TreeNode(3);
        TreeNode two = new TreeNode(9);
        TreeNode three = new TreeNode(20);
        TreeNode four = new TreeNode(15);
        TreeNode five = new TreeNode(7);


//             3
//            / \
//           9  20
//             /  \
//            15   7
        one.left=two;
        one.right = three;
        three.left = four;
        three.right = five;
        List<List<Integer>> list = levelOrderBottom(one);

        System.out.println(list.toString());
    }

    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        levelOrderBottom(list,root,0);
        Collections.reverse(list);
        return list;
    }

    private static void levelOrderBottom(List<List<Integer>> list, TreeNode root, int level) {
        if(root==null) return;
        List<Integer> arr = new ArrayList<>();
        if(list.size()==level){
            arr.add(root.val);
            list.add(arr);
        }
        else{
            list.get(level).add(root.val);
        }
        levelOrderBottom(list, root.left, level+1);
        levelOrderBottom(list, root.right, level+1);
        return;
    }


}
