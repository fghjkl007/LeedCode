package com.leetcode;

public class L108_Convert_Sorted_Array_to_Binary_Search_Tree {

    public static void main(String args[]){
//                 0
//                / \
//              -3   9
//              /   /
//            -10  5

        int[] input = {-10,-3,0,5,9};
        TreeNode treeNode = sortedArrayToBST(input);
        PrintTree.print(treeNode);

    }
    public static TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length-1);
    }

    private static TreeNode helper(int[] nums, int low, int high) {
        if(low>high){
            return null;
        }
        int mid = (low+high)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums, low, mid-1);
        node.right = helper(nums, mid+1, high);
        return node;
    }
}

