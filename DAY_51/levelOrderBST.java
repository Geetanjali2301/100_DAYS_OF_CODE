package DAY_51;
/*
# Leetcode 102
*/

import java.util.*;
public class levelOrderBST {

    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val)
        {
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> list=new ArrayList<>();
        if(root==null)
        {
            return list;
        }

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty())
        {
            int  n=q.size();
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                TreeNode curr=q.remove();
                temp.add(curr.val);

                if(curr.left!=null)
                {
                    q.add(curr.left);
                }
                if(curr.right!=null)
                {
                    q.add(curr.right);
                }
            }
            list.add(temp);
            
        }

        return list;
      
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);

        List<List<Integer>> ans=levelOrder(root);
        System.out.println(ans);
    }
    
}
