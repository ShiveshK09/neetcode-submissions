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
    public boolean isValidBST(TreeNode root) {
        Long min=Long.MIN_VALUE;
        Long max=Long.MAX_VALUE;
        return helper(root,min,max);
    }

    public boolean helper(TreeNode root,Long min,Long max){
        if(root==null) return true;
        Long val=(long)root.val;
        if(val<=min || val>=max) return false;
        return helper(root.left,min,val) && helper(root.right,val,max);
    }


}
