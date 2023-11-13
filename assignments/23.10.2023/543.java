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
     int maxVal=0;
     private int height(TreeNode root)
     {
         if(root==null)
         {
           return 0;
         }
        int lh=height(root.left);
        int rh=height(root.right);
        if(lh+rh>maxVal)
        {
            maxVal=lh+rh;
        }
        return Math.max(lh,rh)+1;
     }
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return maxVal;    
    }
}