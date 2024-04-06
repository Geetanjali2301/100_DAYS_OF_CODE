package DAY_48;
/*
# Leetcode 543

NOTES: DIAM IS PATH FORMED BY CONNECTING MAX NO. OF NODES FROM LEFT SUBTREE AND RIGHT SUBTREE AND THUS RETURN THE TOTAL NO. OF EDGES IN THAT PATH.
       RATHER THAN WRITING 2 DIFF RECURSIVE CALLS FOR HEIGHT AND THEN DIAMETER -> O(N^2), WE MERGE THEM FOR A SIGLE RECURSIVE CALL -> O(N)
*/

public class diamOfTree {

    static int diam;

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

    public static int getdiam(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }

        int lh=getdiam(root.left);
        int rh=getdiam(root.right);

        diam=Math.max(diam,lh+rh);
        return Math.max(lh,rh)+1;
    }

    public static int diameterOfBinaryTree(TreeNode root) {

        diam=0;
        getdiam(root);
        return diam;
        
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);

        int ans=diameterOfBinaryTree(root);
        System.out.println(ans);
    }
    
}
