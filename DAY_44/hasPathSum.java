package DAY_44;
/*
# Leetcode 112
*/

public class hasPathSum {

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

    public static boolean hasSum(TreeNode root,int targetSum)
    {
        if(root==null)
        {
            return false;
        }

        if(root!=null && (root.left==null && root.right==null))
        {
            if(root.val==targetSum)
            {
                return true;
            }
        }

        return hasSum(root.left, targetSum-root.val) || hasSum(root.right, targetSum-root.val);
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);

        int target=5;
        boolean ans=hasSum(root,target);
        System.out.println(ans);
    }
    
}
