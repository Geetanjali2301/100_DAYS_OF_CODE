package DAY_45;
/*
# Leetcode 404
*/

public class sumOfLeftLeaves {

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

    public static int sumOfLeftLeaves(TreeNode root) {
        int sum=0;

        if(root==null)
        {
            return 0;
        }

        if(root.left!=null)
        {
            if(root.left.left==null && root.left.right==null)
            {
                sum+=root.left.val;
            }
        }

        sum+=sumOfLeftLeaves(root.left);
        sum+=sumOfLeftLeaves(root.right);
        return sum;      
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.right.left=new TreeNode(4);

        int ans=sumOfLeftLeaves(root);

        System.out.println(ans);
    }
    
}
