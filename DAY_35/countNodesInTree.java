package DAY_35;
/*
# Leetcode 222
*/

public class countNodesInTree {

    public static class TreeNode{
        int val;
        TreeNode left=null;
        TreeNode right=null;

        public TreeNode(int val)
        {
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }

    public static int countNodes(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        int left=countNodes(root.left);
        int right=countNodes(root.right);
        return left+right+1;     
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        int ans=countNodes(root);
        System.out.println(ans);
    }
    
}
