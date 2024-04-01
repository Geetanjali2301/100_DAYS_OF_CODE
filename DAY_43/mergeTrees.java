package DAY_43;
/*
# Leetcode 617
*/

import java.util.ArrayList;

public class mergeTrees {

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

    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {

        if(root1==null && root2==null)
        {
            return root1;
        }

        if(root1==null)
        {
            return root2;
        }
        if(root2==null)
        {
            return root1;
        }

        root1.val=root1.val+root2.val;
        root1.left=mergeTrees(root1.left, root2.left);
        root1.right=mergeTrees(root1.right, root2.right);

        return root1;

        
    }

    public static void inorder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        TreeNode root1=new TreeNode(1);
        root1.left=new TreeNode(2);
        root1.right=new TreeNode(3);
        root1.left.left=new TreeNode(4);

        TreeNode root2=new TreeNode(1);
        root2.left=new TreeNode(3);
        root2.right=new TreeNode(2);

        TreeNode ans=mergeTrees(root1, root2);
        inorder(ans);

    }
    
}
