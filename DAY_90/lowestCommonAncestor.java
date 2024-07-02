package DAY_90;
/*
#Leetcode 236
*/

public class lowestCommonAncestor {

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

    public static TreeNode lowestCommonAncestor(TreeNode root, int p, int q) {

        if(root==null || root.val==p || root.val==q)
        {
            return root;
        }

        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);

        if(left==null)
        {
            return right;
        }
        else if(right==null)
        {
            return left;
        }
       
        return root;
        
    }

    public static void main(String[] args) {
        
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.right.left=new TreeNode(4);
        root.right.left.left=new TreeNode(8);
        root.right.right=new TreeNode(5);
        root.right.right.right=new TreeNode(7);

        TreeNode  ans=lowestCommonAncestor(root,7,8);
        System.out.println(ans.val);
    }
    
}
