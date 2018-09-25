package com.leetcode;

public class L104_Maximum_Depth_of_Binary_Tree {
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

        System.out.println(maxDepth(one));


    }
    public static int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
    }
}
