package DAY_56;
/*
# Leetcode 129 
*/

public class rootToLeafSum {

    public  static class TreeNode{
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

    public static int helper(TreeNode root,int sum)
    {
        if(root==null)
        {
            return 0;
        }
        sum=sum*10+root.val;

        if(root.left==null && root.right==null)
        {
            return sum;
        }
        int left=helper(root.left,sum);
        int right=helper(root.right,sum);
        return left+right;

    }

    public static int sumNumbers(TreeNode root) {
        return helper(root,0);      
    }

    public static void main(String[] args) {

        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);

        int ans=sumNumbers(root);
        System.out.println(ans);
    }
    
}
