package com.leetcode;

import java.util.Objects;

public class L100_Same_Tree  {
    public static void main(String args[]){
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);

        TreeNode oneq = new TreeNode(1);
        TreeNode twoq = new TreeNode(2);
        TreeNode threeq = new TreeNode(3);
        TreeNode fourq = new TreeNode(4);
        TreeNode fiveq = new TreeNode(5);

        one.left = two;
       // two.right = three;

        oneq.right = twoq;
       // twoq.right = fourq;

        System.out.println(isSameTree(one, oneq));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null||q==null){
            return p==q;
        }
        if(!Objects.equals(p.val,q.val)){
            return false;
        }
        return isSameTree(p.left, q.left)&&isSameTree(p.right, q.right);

    }
}
