package DAY_45;
/*
# Leetcode 226
*/

public class invertBTree {

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

    public static TreeNode invertTree(TreeNode root) {
        if(root==null)
        {
            return null;
        }

        TreeNode temp=root.right;
        root.right=root.left;
        root.left=temp;

        invertTree(root.left);
        invertTree(root.right);

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
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);

        TreeNode ans=invertTree(root);

        print(ans);
    }
    
}
