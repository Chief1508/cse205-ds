import java.util.*;
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
     List<Integer> list=new ArrayList<>();
     int maxi=0;
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null)
        {
            return list;
        }
        rightView(root,1);
        return list;
    }
    public void rightView(TreeNode root,int level)
    {
        if(root==null)
        {
            return;
        }
        if(maxi<level)
        {
            list.add(root.val);
            maxi=level;
        }
        rightView(root.right,level+1);
        rightView(root.left,level+1);
    }
}