package DAY_55;
/*
# Leetcode 897
*/

public class increasingOrderTree {

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

    static TreeNode temp=new TreeNode(-1);
    TreeNode ans=temp;
    public TreeNode increasingBST(TreeNode root) {

        inorder(root);
        return ans.right;     
    }

    public static void inorder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        temp.right=new TreeNode(root.val);
        temp=temp.right;
        inorder(root.right);
    }

    public static void print(TreeNode root)
    {
        if(root==null)
        {
            return;
        }

        print( root.left);
        System.out.print(root.val+" ");
        print(root.right);
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(2);
        root.left=new TreeNode(1);
        root.right=new TreeNode(4);

        increasingOrderTree i=new increasingOrderTree();
        i.increasingBST(root);
        print(root);
      
    }
    
}
