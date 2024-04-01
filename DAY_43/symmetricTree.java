package DAY_43;
/*
# Leetcode 101
*/

public class symmetricTree {

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

    public static boolean isSymmetric(TreeNode root) {

        return isSym(root.left,root.right);
        
    }

    public static boolean isSym(TreeNode l,TreeNode r)
    {
        if(l==null && r==null)
        {
            return true;
        }

        if(l==null || r==null)
        {
            return false;
        }

        if(l.val!=r.val)
        {
            return false;
        }

        return isSym(l.left,r.right) && isSym(l.right,r.left);
    }

    public static void main(String[] args) {
    
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(2);
        root.right=new TreeNode(2);
        root.right.left=new TreeNode(2);

        boolean ans=isSymmetric(root);
        System.out.println(ans);
    }
    
}
