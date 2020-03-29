package com.leetcode.extra;

import com.leetcode.PrintTree;
import com.leetcode.TreeNode;

public class CreateBST {
    public static void main(String args[]){
        int[] array = {8,6,9,10};
        TreeNode treeNode = new TreeNode(5);
        for(int value: array){
            create(treeNode, value);
        }
        PrintTree.print(treeNode);

    }

    private static void create(TreeNode root, int value){
        if(root==null){
            root = new TreeNode(value);
            return;
        }

        if(root.val<value){
            create(root.right, value);
        }else if(root.val> value){
            create(root.left, value);
        }
    }
}
