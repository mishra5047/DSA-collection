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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list = new ArrayList<>();
        helper(root, "", list, 0, targetSum);
        return list;
    }
    
    public void helper(TreeNode node, String psf, List<List<Integer>> list, int pathSum, int target){
        if(node == null){ 
        return;
        }
        psf += node.val + ",";
        pathSum += node.val;
        
        if(node.left == null && node.right == null){
            if(pathSum == target){
                List<Integer> listToAdd = new ArrayList<>();
                String[] arr = psf.split(",");
                for(String str : arr){
                    listToAdd.add(Integer.parseInt(str));
                }
                list.add(listToAdd);
            }
            return;    
        }
        if(node.left != null){
          helper(node.left, psf, list, pathSum, target);  
        }
        if(node.right != null){
        helper(node.right, psf, list, pathSum, target);
    }
    }
}
