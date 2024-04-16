/*
# Leetcode 623
*/

public class addRowToTree {

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

    public static void helper(TreeNode root,int val,int depth,int pos)
    {
        if(root==null)
        {
            return;
        }
        if(pos+1==depth)
        {
            TreeNode temp1=new TreeNode(val);
            TreeNode temp2=new TreeNode(val);

            temp1.left=root.left;
            temp2.right=root.right;

            root.left=temp1;
            root.right=temp2;
        }

        helper(root.left,val,depth,pos+1);
        helper(root.right,val,depth,pos+1);
    }

    public static TreeNode addOneRow(TreeNode root, int val, int depth) {

        if(depth==1)
        {
            TreeNode temp=new TreeNode(val);
            temp.left=root;
            root=temp;
            return root;
        }
        helper(root,val,depth,1);
        return root;
        
    }

    public static void print(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        print(root.left);
        System.out.print(root.val+" ");
        print(root.right);
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(4);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(3);
        root.left.right=new TreeNode(1);

        int val=6;
        int depth=3;

        TreeNode ans=addOneRow(root, val, depth);
        print(ans);
    }

    
}
