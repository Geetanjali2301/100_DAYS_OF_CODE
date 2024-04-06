package DAY_48;
/*
# Leetcode 653
*/

import java.util.*;
public class twoSum4 {

    public static class TreeNode
    {
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

    public static void inorder(TreeNode root,ArrayList<Integer> l)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left,l);
        l.add(root.val);
        inorder(root.right,l);

    }
    public static boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> l=new ArrayList<>();
        inorder(root,l);

        int i=0,j=l.size()-1;
        int sum=0;
        while(i<j)
        {
            sum=l.get(i)+l.get(j);
            if(sum==k)
            {
                return true;
            }
            else if(sum>k)
            {
                j--;
            }
            else
            {
                i++;
            }

        }
        return false;     
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(2);
        root.right=new TreeNode(4);

        int k=6;
        boolean ans=findTarget(root, k);
        System.out.println(ans);
    }
    
}
