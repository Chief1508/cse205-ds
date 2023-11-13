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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) 
    {
        List<List<Integer>> list=new ArrayList<>();
        int count=0;
        pre(root,0,list,count);
        return list;    
    }
    public static void pre(TreeNode root,int s,List<List<Integer>> list,int count)
    {
        if(root==null)
        {
            return;
        }
        if(list.size()==s)
        {
            List<Integer> li=new ArrayList<>();
            li.add(root.val);
            count++;
            list.add(li);
        }
        else
        {
            list.get(s).add(root.val);
        }
        pre(root.left,s+1,list,count);
        pre(root.right,s+1,list,count);
    }
}