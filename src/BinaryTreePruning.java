/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode pruneTree(TreeNode root) {
        if(root==null) return root;
        
        return hasOne(root) ? root : null;
    }
    
    private boolean hasOne(TreeNode root){
        if(root==null) return false;
        
        boolean left=hasOne(root.left);
        boolean right=hasOne(root.right);
        
        root.left=!left ? null : root.left;
        root.right=!right ? null : root.right;
        
        return root.val==1 || left || right;
    }
}
