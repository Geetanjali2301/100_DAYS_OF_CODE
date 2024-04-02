package DAY_44;
/*
# Leetcode 104
*/

public class maxDepthOfTree {

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

    public static int maxDepth(TreeNode root) {

        if(root==null)
        {
            return 0;
        }
        int ld=maxDepth(root.left);
        int rd=maxDepth(root.right);
        int depth=Math.max(ld,rd)+1;
        return depth;
        
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.right.left=new TreeNode(4);

        int depth=maxDepth(root);
        System.out.println(depth);

    }
    
}
