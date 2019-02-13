package com.leetcode;

public class L110_Balanced_Binary_Tree {
    public static void main(String args[]){
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(3);
        TreeNode node6 = new TreeNode(4);
        TreeNode node7 = new TreeNode(4);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node4.left = node6;
        node4.right = node7;

        System.out.println(isBalanced(node1));
    }

    public static boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        boolean[] balanced = {true};

        height(root, balanced);
        return balanced[0];
    }

    private static int height(TreeNode root, boolean[] balanced){
        if(root==null) return 0;
        int left = height(root.left, balanced);
        int right = height(root.right, balanced);
        if(Math.abs(left-right)>1){
            balanced[0] = Boolean.FALSE;
            return -1;
        }
        return Math.max(left, right) + 1;
    }

}
