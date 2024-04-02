package DAY_44;
/*
# Leetcode 111
*/

public class miDepth {

    public static class TreeNode{
        int val;
        TreeNode right;
        TreeNode left;

        public TreeNode(int val)
        {
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }

    public static int minDepth(TreeNode root) {

        if(root==null)
        {
            return 0;
        }
      
        int ld=minDepth(root.left);
        int rd=minDepth(root.right);
        if(ld==0 || rd==0)
        {
            return Math.max(ld,rd)+1;
        }
        
        return Math.min(ld,rd)+1;
        
    }

    public static void main(String[] args) {

        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.right.left=new TreeNode(4);

        int depth=minDepth(root);
        System.out.println(depth);


        
    }
    
}
