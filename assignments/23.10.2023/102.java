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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        pre(root,0,list);
        return list;
    }
        public static void pre(TreeNode root,int l,List<List<Integer>> list)
        {
            if(root==null)
            {
                return;
            }
            if(list.size()==l)
            {
                List<Integer> l1=new ArrayList<>();
                l1.add(root.val);
                list.add(l1);
            }
            else
            {
                list.get(l).add(root.val);
            }
            pre(root.left,l+1,list);
            pre(root.right,l+1,list);
        

    }
}