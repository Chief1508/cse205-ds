/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)
        {
            return null;
        }
        if(root==p)
        {
            return p;
        }
        if(root==q)
        {
            return q;
        }
        TreeNode lef=lowestCommonAncestor(root.left,p,q);
        TreeNode rig=lowestCommonAncestor(root.right,p,q);
        if(lef==null)
        {
            return rig;
        }
        if(rig==null)
        {
            return lef;
        }
        return root;
    }
}