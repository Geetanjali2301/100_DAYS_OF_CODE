package DAY_43;

import DAY_2.sortedOrNot;

public class balancedTree {

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

    public static int height(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }

        int left=height(root.left);
        int right=height(root.right);
        return Math.max(left,right)+1;
    }

    public static boolean isBalanced(TreeNode root) {

        if(root==null)
        {
            return true;
        }

        if(Math.abs(height(root.left)-height(root.right))>1)
        {
            return false;
        }

        return isBalanced(root.left) && isBalanced(root.right);
        
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);

        boolean ans=isBalanced(root);
        System.out.println(ans);
    }
    
}
