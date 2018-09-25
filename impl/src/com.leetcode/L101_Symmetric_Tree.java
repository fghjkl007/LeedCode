package com.leetcode;

import java.util.Objects;

public class L101_Symmetric_Tree {
    public static void main(String args[]){
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode two2 = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode three2 = new TreeNode(3);
        TreeNode four2 = new TreeNode(4);

        TreeNode five = new TreeNode(5);
        one.left = two;
        two.left = three;
        two.right = four;
        one.right = two2;
        two2.left = four2;
        two2.right = three2;

        System.out.println(isSymmetric(one));


    }

    public static boolean isSymmetric(TreeNode root) {
        return root == null||isSymmetric(root.left, root.right);
    }
    private static boolean isSymmetric(TreeNode p, TreeNode q) {
        if(p==null||q==null){
            return p==q;
        }
        if(!Objects.equals(p.val,q.val)){
            return false;
        }
        return isSymmetric(p.left,q.right)&&isSymmetric(p.right,q.left);
    }
}

