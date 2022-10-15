package com.company;





 class BinaryTreeNode {
 int data;
 BinaryTreeNode left;
 BinaryTreeNode right;

 BinaryTreeNode(int data) {
 this.data = data;
 this.left = null;
 this.right = null;
 }
 }



public class Solution {
    static class Pair{
        int val;
        int occ;
        Pair(int v, int o){
            val = v;
            occ = o;
        }
    }
    static int maxPathTillNow = -1;
    public static int longestUnivaluePath(BinaryTreeNode root) {
        // Write your code here
        maxPathTillNow = 0;
        Pair ans = helper(root);
        return Math.max(maxPathTillNow, ans.occ);
    }
    private static Pair helper(BinaryTreeNode root){
        if(root == null) {
            return null;
        }

        Pair left = helper(root.left);
        Pair right = helper(root.right);

        if(left == null && right == null){
            // leaf Node
            return new Pair(root.data, 0);
        }else if(left == null){
            // right Have something
            if(right.val == root.data){
                // if equal child and parent
                right.occ += 1;
                maxPathTillNow = Math.max(maxPathTillNow, right.occ);
                return right;
            }else{
                maxPathTillNow = Math.max(maxPathTillNow, right.occ);
                return new Pair(root.data, 0);
            }
        }else if(right == null){
            // left have something
            if(left.val == root.data){
                left.occ += 1;
                maxPathTillNow = Math.max(maxPathTillNow, left.occ);
                return right;
            }else{
                maxPathTillNow = Math.max(maxPathTillNow, left.occ);
                return new Pair(root.data, 0);
            }
        }else{
            if(left.val == root.data && right.val == root.data){
                int max = Math.max(left.occ, right.occ);
                maxPathTillNow = Math.max(maxPathTillNow, left.occ + right.occ + 2);
                return new Pair(root.data, max + 1);
            }else if(left.val == root.data){
                left.occ++;
                maxPathTillNow = Math.max(maxPathTillNow, left.occ);
                return left;
            }else if(right.val == root.data){
                right.occ++;
                maxPathTillNow = Math.max(maxPathTillNow, right.occ);
                return right;
            }else{
                maxPathTillNow = Math.max(maxPathTillNow, Math.max(right.occ, left.occ));
                return new Pair(root.data, 0);
            }
        }

    }
}