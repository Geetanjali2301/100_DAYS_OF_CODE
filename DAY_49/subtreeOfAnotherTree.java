package DAY_49;
/*
# Leetcode 572
*/

public class subtreeOfAnotherTree {

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

    public static boolean helper(TreeNode root, TreeNode subRoot)
    {
        if(root==null && subRoot==null)
        {
            return true;
        }
        if(root==null || subRoot==null )
        {
            return false;
        }

        //we check whether if root values are same them its left and right should also be same
        return (root.val==subRoot.val && helper(root.left,subRoot.left) && helper(root.right,subRoot.right));


    }
    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {

        //when subroot is null its always a subtree of main tree
        if(subRoot==null)
        {
            return true;
        }

        //if root itself is null there is no main tree
        if(root==null)
        {
            return false;
        }

        //if we found identical nodes then we return true    
        if(helper(root,subRoot))
        {
            return true;
        }

        //else we check whether we can found subtree in left side of root or right side of root
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
        
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(4);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);

        TreeNode root1=new TreeNode(4);
        root1.left=new TreeNode(2);
        root1.right=new TreeNode(3);

        boolean ans=isSubtree(root, root1);
        System.out.println(ans);


    }
    
}
