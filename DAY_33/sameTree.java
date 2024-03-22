package DAY_33;
/*
# Leetccode 100
*/

public class sameTree {

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

    public static boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null)
            return true;

        if (q == null || p == null)
            return false;
        if (p.val != q.val)
            return false;

        return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);

    }

    public static void main(String[] args) {
        TreeNode root1=new TreeNode(1);
        root1.left=new TreeNode(2);
        root1.right=new TreeNode(3);

        TreeNode root2=new TreeNode(1);
        root2.left=new TreeNode(2);
        root2.right=new TreeNode(3);

        boolean ans=isSameTree(root1, root2);
        System.out.println(ans);

    }
    
}
