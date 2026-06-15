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
    int maxDiameter;

    public int diameterOfBinaryTree(TreeNode root) {
     maxDiameter=0;
     height(root);
     return maxDiameter;   
    }
    public int height(TreeNode root){
        if(root==null) return -1;
        int left=height(root.left);
        int right=height(root.right);
        int h=1+Math.max(left,right);
        maxDiameter=Math.max(maxDiameter,left+right+2);
        return h;
    }
}
